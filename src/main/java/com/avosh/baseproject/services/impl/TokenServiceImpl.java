/*
 * ******************************************************************************
 *  * Created by Alireza Amirkhani 2022
 *  *****************************************************************************
 */

package com.avosh.baseproject.services.impl;

import com.avosh.baseproject.entity.Device;
import com.avosh.baseproject.entity.SecUser;
import com.avosh.baseproject.excptions.DeleteExceptionException;
import com.avosh.baseproject.excptions.PasswordNotMatchException;
import com.avosh.baseproject.excptions.UserIsDisabledException;
import com.avosh.baseproject.excptions.UserNotFoundException;
import com.avosh.baseproject.repository.DeviceRepository;
import com.avosh.baseproject.repository.UserRepository;
import com.avosh.baseproject.services.TokenService;
import com.avosh.baseproject.util.Empty;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import net.bytebuddy.utility.RandomString;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

@Service
public class TokenServiceImpl implements TokenService {
    private final Integer TOKEN_LENGTH = 255;
    private static final Logger log = Logger.getLogger(TokenServiceImpl.class);
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private DeviceRepository deviceRepository;
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public String getTokenByUserPassword(String user, String pass, String mac, String name) {
        String uuid = null;

        SecUser res = userRepository.findByCellphone(user);
        if (Empty.isEmpty(res)) {
            log.info("user not found : " + user);
            throw new UserNotFoundException();
        }
        if (!passwordEncoder.matches(pass, res.getPassword())) {
            log.info("password not match : " + user);
            throw new PasswordNotMatchException();
        }
        if (!res.getEnable()) {
            log.info("User is Desabled : " + user);
            throw new UserIsDisabledException();
        }
        List<Device> devices = res.getDeviceList();
        if (Empty.isEmpty(devices)) {
            log.info("user has no device : " + user);
            uuid = getTokenFromNewDevice(res.getId(), mac, name,user);
        } else {
            Device device = null;
            for (Device dv : devices) {
                if (dv.getMac().equals(mac)) {
                    device = dv;
                }
            }
            if (Empty.isNotEmpty(device)) {
                log.info("user has a device with this mac : " + user);
                uuid = getTokenFromExistingDevice(device,user);
            } else {
                log.info("user has no device with this mac : " + user);
                uuid = getTokenFromNewDevice(res.getId(), mac, name,user);
            }
        }

        return uuid;
    }

    private String getTokenFromNewDevice(Long UserId, String mac, String name,String user) {
        RandomString gen = new RandomString(TOKEN_LENGTH, ThreadLocalRandom.current());
        String uuid = getJWTToken(user);
        Device device = new Device();
        device.setToken(uuid);
        device.setName(name);
        device.setMac(mac);
        device.setSecUserId(new SecUser(UserId));
        deviceRepository.save(device);
        return uuid;
    }

    private String getTokenFromExistingDevice(Device device,String user) {
        RandomString gen = new RandomString(TOKEN_LENGTH, ThreadLocalRandom.current());
        String uuid = getJWTToken(user);
        device.setToken(uuid);
        deviceRepository.save(device);
        return uuid;
    }


    @Override
    public Boolean isTokenValid(String token, String mac) {
        return Empty.isNotEmpty(deviceRepository.findByTokenAndMac(token, mac));
    }

    @Override
    public Boolean isTokenValid(String token) {
        return Empty.isNotEmpty(deviceRepository.findByToken(token));
    }

    @Override
    @Transactional
    public void deleteDeviceByToken(String token) {
        Long res = deviceRepository.deleteByToken(token);
        if (res == 0) {
            throw new DeleteExceptionException();
        }
    }

    private String getJWTToken(String username) {
        String secretKey = "mySecretKey";
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils
                .commaSeparatedStringToAuthorityList("ROLE_USER");

        String token = Jwts
                .builder()
                .setId("softtekJWT")
                .setSubject(username)
                .claim("authorities",
                        grantedAuthorities.stream()
                                .map(GrantedAuthority::getAuthority)
                                .collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 600000))
                .signWith(SignatureAlgorithm.HS512,
                        secretKey.getBytes()).compact();

        return "Bearer " + token;
    }

}
