/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.services.impl;

import com.avosh.baseproject.dto.PackageDto;
import com.avosh.baseproject.dto.SubLessonDto;
import com.avosh.baseproject.entity.Package;
import com.avosh.baseproject.entity.SubLesson;
import com.avosh.baseproject.repository.PackageRepository;
import com.avosh.baseproject.services.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PackageServiceImpl implements PackageService {

    @Autowired
    PackageRepository repository;

    @Override
    public void save(PackageDto dto) {
        Package aPackage = new Package();
        aPackage.setDesc(dto.getDesc());
        aPackage.setDiscount(dto.getDiscount());
        aPackage.setEndDiscount(dto.getEndDiscount());
        aPackage.setFee(dto.getFee());
        aPackage.setId(dto.getId());
        aPackage.setPicture(dto.getPicture());
        aPackage.setTitle(dto.getTitle());
        SubLesson subLesson = new SubLesson();
        subLesson.setId(dto.getSubLesson().getId());
        aPackage.setSubLessonId(subLesson);
        repository.save(aPackage);

    }

    @Override
    public List<PackageDto> retrieveAll() {
        List<PackageDto> list = new ArrayList<>();
        Iterable<Package> itr = repository.findAll();
        for (Package pkg : itr) {

            SubLessonDto subLessonDto = new SubLessonDto();
            subLessonDto.setId(pkg.getSubLessonId().getId());
            subLessonDto.setTitle(pkg.getSubLessonId().getTitle());

            PackageDto packageDto = new PackageDto(pkg.getId(),pkg.getTitle(),pkg.getDesc(),
                    pkg.getFee(),pkg.getDiscount(),pkg.getEndDiscount(),pkg.getPicture(),subLessonDto);
            list.add(packageDto);

        }
        return list;
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
