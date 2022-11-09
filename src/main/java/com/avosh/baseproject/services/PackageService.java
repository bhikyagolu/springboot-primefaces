/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.services;

import com.avosh.baseproject.dto.PackageDto;
import com.avosh.baseproject.entity.Package;
import com.avosh.baseproject.repository.PackageRepository;

public interface PackageService extends BaseService<PackageRepository, Package, PackageDto> {
}
