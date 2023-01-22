/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.services.impl;

import com.avosh.baseproject.conf.CustomUserDetail;
import com.avosh.baseproject.dto.UserDto;
import com.avosh.baseproject.entity.Device;
import com.avosh.baseproject.entity.SecUser;
import com.avosh.baseproject.excptions.BadRequestException;
import com.avosh.baseproject.excptions.SaveContactException;
import com.avosh.baseproject.excptions.SaveProfileException;
import com.avosh.baseproject.model.Email;
import com.avosh.baseproject.repository.DeviceRepository;
import com.avosh.baseproject.repository.UserRepository;
import com.avosh.baseproject.services.UserProfileService;
import com.avosh.baseproject.util.Empty;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@PreAuthorize("hasRole('ROLE_ADMIN')")
public class UserProfileServiceImpl implements UserProfileService {
    private static final Logger log = Logger.getLogger(UserProfileServiceImpl.class);

    @Autowired
    UserRepository repository;
    @Autowired
    DeviceRepository deviceRepository;
    @Autowired
    PasswordEncoder passwordEncoder;


    @Override
    public void save(UserDto dto) {
        SecUser user = new SecUser();
        repository.save(user);
    }

    @Override
    public List<UserDto> retrieveAll() {

        return null;
    }

    @Override
    public UserDto retrieveById(Long id) {
        return retrieveById();
    }

    @Override
    public void deleteById(Long id) {

    }

    public UserDto retrieveById() {
        CustomUserDetail auth = (CustomUserDetail) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Optional<SecUser> user = repository.findById(auth.getSecUser().getId());
        UserDto userDto = new UserDto();
        userDto.setId(user.get().getId());
        userDto.setName(user.get().getName());
        userDto.setFamily(user.get().getFamily());
        userDto.setAddress(user.get().getAddress());
        userDto.setCellphone(user.get().getCellphone());
        userDto.setCreateDate(user.get().getCreateDate());
        userDto.setEmail(user.get().getEmail());
        userDto.setGender(user.get().getGender());
        userDto.setEnable(user.get().getIsEnable());
        userDto.setLastLogin(user.get().getLastLogin());
        userDto.setNationalcode(user.get().getNationalcode());
        userDto.setIban(user.get().getIban());
        userDto.setAbout(user.get().getAbout());
        userDto.setPhone(user.get().getPhone());
        return userDto;
    }

    @Override
    public Boolean changePassword(String newPassword, String oldPassword) {
        CustomUserDetail auth = (CustomUserDetail) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        try {
            if (passwordEncoder.matches(oldPassword, auth.getPassword())) {
                repository.updatePassword(passwordEncoder.encode(newPassword), auth.getSecUser().getId());
                log.info("Password Has been changed user id = " + auth.getSecUser().getId());
                return true;
            }
            throw new BadRequestException();

        } catch (Exception e) {
            log.info("Password Has been not changed user id = " + auth.getSecUser().getId());
            log.info(e);
            throw new BadRequestException();
        }
    }

    @Override
    public void updateContact(UserDto userDto) {
        CustomUserDetail auth = (CustomUserDetail) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        userDto.setId(auth.getSecUser().getId());
        try {
            repository.updateContact(userDto);
            log.info("Contact has been updated id = " + auth.getSecUser().getId());
        } catch (Exception e) {
            log.info("Contact not updated id = " + auth.getSecUser().getId());
            log.info(e);
            throw new SaveContactException();
        }

    }

    @Override
    public void updateProfile(UserDto userDto) {
        CustomUserDetail auth = (CustomUserDetail) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        userDto.setId(auth.getSecUser().getId());
        try {
            repository.updateProfile(userDto);
            log.info("Profile has been updated id = " + auth.getSecUser().getId());
        } catch (Exception e) {
            log.info("Profile not updated id = " + auth.getSecUser().getId());
            log.info(e);
            throw new SaveProfileException();
        }


    }

    @Override
    public UserDto retrieveUserProfileByToken(String token) {
        Device res = deviceRepository.findByToken(token);
        SecUser user = res.getSecUserId();
        ;
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setFamily(user.getFamily());
        userDto.setAddress(user.getAddress());
        userDto.setCellphone(user.getCellphone());
        userDto.setCreateDate(user.getCreateDate());
        userDto.setEmail(user.getEmail());
        userDto.setGender(user.getGender());
        userDto.setLastLogin(user.getLastLogin());
        userDto.setNationalcode(user.getNationalcode());
        userDto.setIban(user.getIban());
        userDto.setAbout(user.getAbout());
        userDto.setPhone(user.getPhone());
        return userDto;
    }

    @Override
    public Boolean updatePartOfProfile(UserDto userDto, String token) {
        try {
            Device res = deviceRepository.findByToken(token);
            userDto.setId(res.getId());
            userDto.setCellphone(res.getSecUserId().getCellphone());
            userDto.setCreateDate(res.getSecUserId().getCreateDate());
            userDto.setLastLogin(res.getSecUserId().getLastLogin());
            userDto.setEnable(res.getSecUserId().getEnable());
            userDto.setPassword(res.getSecUserId().getPassword());
            userDto.setToken(res.getSecUserId().getToken());
            userDto.setUpdateDate(new Date());
            userDto.setLogin(res.getSecUserId().getLogin());
            int result = repository.updateProfile(userDto);
            if (Empty.isNotEmpty(result)) {
                if (result > 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
