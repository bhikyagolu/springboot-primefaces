/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.services.impl;

import com.avosh.baseproject.conf.CustomUserDetail;
import com.avosh.baseproject.dto.UserDto;
import com.avosh.baseproject.entity.SecUser;
import com.avosh.baseproject.excptions.BadRequestException;
import com.avosh.baseproject.excptions.SaveContactException;
import com.avosh.baseproject.excptions.SaveProfileException;
import com.avosh.baseproject.repository.UserRepository;
import com.avosh.baseproject.services.UserProfileService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserProfileServiceImpl implements UserProfileService {
    private static final Logger log = Logger.getLogger(UserProfileServiceImpl.class);

    @Autowired
    UserRepository repository;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    UserRepository userRepository;


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
                userRepository.updatePassword(passwordEncoder.encode(newPassword), auth.getSecUser().getId());
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
            userRepository.updateContact(userDto);
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
            userRepository.updateProfile(userDto);
            log.info("Profile has been updated id = " + auth.getSecUser().getId());
        } catch (Exception e) {
            log.info("Profile not updated id = " + auth.getSecUser().getId());
            log.info(e);
            throw new SaveProfileException();
        }


    }
}
