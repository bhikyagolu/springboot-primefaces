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
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.List;
import java.util.UUID;

@Service
public class TokenServiceImpl implements TokenService {
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
            uuid = getTokenFromNewDevice(res.getId(), mac, name);
        } else {
            Device device = null;
            for (Device dv : devices) {
                if (dv.getMac().equals(mac)) {
                    device = dv;
                }
            }
            if (Empty.isNotEmpty(device)) {
                log.info("user has a device with this mac : " + user);
                uuid = getTokenFromExistingDevice(device);
            } else {
                log.info("user has no device with this mac : " + user);
                uuid = getTokenFromNewDevice(res.getId(), mac, name);
            }
        }

        return uuid;
    }

    private String getTokenFromNewDevice(Long UserId, String mac, String name) {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        Device device = new Device();
        device.setToken(uuid);
        device.setName(name);
        device.setMac(mac);
        device.setSecUserId(new SecUser(UserId));
        deviceRepository.save(device);
        return uuid;
    }

    private String getTokenFromExistingDevice(Device device) {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        device.setToken(uuid);
        deviceRepository.save(device);
        return uuid;
    }


    @Override
    public Boolean isTokenValid(String token, String mac) {
        if (Empty.isNotEmpty(deviceRepository.findByTokenAndMac(token, mac))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Boolean isTokenValid(String token) {
        if (Empty.isNotEmpty(deviceRepository.findByToken(token))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    @Transactional
    public void deleteDeviceByToken(String token) {
        Long res = deviceRepository.deleteByToken(token);
        if (res == 0) {
            throw new DeleteExceptionException();
        }
    }

    protected void generateUniqueKeyUsingMessageDigest() {
        try {
            // cryptographically strong random number generator. Options: NativePRNG or SHA1PRNG
            SecureRandom crunchifyPRNG = SecureRandom.getInstance("SHA1PRNG");
            // generate a random number
            String crunchifyRandomNumber = new Integer(crunchifyPRNG.nextInt()).toString();
            // Provides applications the functionality of a message digest algorithm, such as MD5 or SHA
            MessageDigest crunchifyMsgDigest = MessageDigest.getInstance("SHA-256");
            // Performs a final update on the digest using the specified array of bytes, then completes the digest computation
            byte[] crunchifyByte = crunchifyMsgDigest.digest(crunchifyRandomNumber.getBytes());
            System.out.println( crunchifyRandomNumber);
            System.out.println( crunchifyEncodeUsingHEX(crunchifyByte));

        } catch (Exception e) {
            System.out.println("Error during creating MessageDigest");
        }
    }

     protected StringBuilder crunchifyEncodeUsingHEX(byte[] crunchifyByte) {
        StringBuilder crunchifyResult = new StringBuilder();
         char[] crunchifyKeys = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'I', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
                 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
        for (int index = 0; index < crunchifyByte.length; ++index) {
            byte myByte = crunchifyByte[index];
            // Appends the string representation of the char argument to this sequence
            crunchifyResult.append(crunchifyKeys[(myByte & 0xf0) >> 9]);
            crunchifyResult.append(crunchifyKeys[myByte & 0x0f]);
        }
        return crunchifyResult;
    }
}
