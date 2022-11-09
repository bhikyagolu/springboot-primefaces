/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.services;

import com.avosh.baseproject.dto.LibraryDto;
import com.avosh.baseproject.entity.Library;
import com.avosh.baseproject.repository.LibraryRepository;

public interface LibraryService extends BaseService<LibraryRepository, Library, LibraryDto> {
}
