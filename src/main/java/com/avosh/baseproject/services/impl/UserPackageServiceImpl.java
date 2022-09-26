/*******************************************************************************
* Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.services.impl;

import com.avosh.baseproject.dto.*;
import com.avosh.baseproject.entity.SubLesson;
import com.avosh.baseproject.entity.UserPackage;
import com.avosh.baseproject.repository.UserPackageRepository;
import com.avosh.baseproject.services.UserPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserPackageServiceImpl implements UserPackageService {

    @Autowired
    UserPackageRepository repository;

    @Override
    public void save(UserPackageDto dto) {

    }

    @Override
    public List<UserPackageDto> retrieveAll() {
        List<UserPackageDto> list = new ArrayList<>();
        Iterable<UserPackage> itr = repository.findAll();
        for (UserPackage userPackage : itr) {
            UserPackageDto userPackageDto = new UserPackageDto();
            userPackageDto.setId(userPackage.getId());
            UserDto userDto = new UserDto();
            userDto.setId(userPackage.getSecUserId().getId());
            userDto.setName(userPackage.getSecUserId().getName());
            userDto.setFamily(userPackage.getSecUserId().getFamily());
            userPackageDto.setUserDto(userDto);
            PackageDto packageDto = new PackageDto();
            packageDto.setId(userPackage.getPackageId().getId());
            packageDto.setTitle(userPackage.getPackageId().getTitle());
            userPackageDto.setPackageDto(new PackageDto());
            list.add(userPackageDto);

        }
        return list;
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
