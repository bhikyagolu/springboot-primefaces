/*******************************************************************************
* Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.services.impl;

import com.avosh.baseproject.conf.CustomUserDetail;
import com.avosh.baseproject.dto.LibraryDto;
import com.avosh.baseproject.dto.SubLessonDto;
import com.avosh.baseproject.entity.Library;
import com.avosh.baseproject.entity.SubLesson;
import com.avosh.baseproject.repository.LibraryRepository;
import com.avosh.baseproject.services.LibraryService;
import com.avosh.baseproject.util.Empty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryServiceImpl implements LibraryService {

    @Autowired
    LibraryRepository repository;

    @Override
    public void save(LibraryDto dto) {
        CustomUserDetail auth = (CustomUserDetail) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Library library = new Library();
        if (Empty.isNotEmpty(dto.getId())) {
            library.setId(dto.getId());
        }
        library.setName(dto.getName());
        library.setType(dto.getType());
        library.setSubLessonId(new SubLesson(dto.getLessonDto().getId()));
        repository.save(library);
    }

    @Override
    public List<LibraryDto> retrieveAll() {
        List<LibraryDto> list = new ArrayList<>();
        Iterable<Library> itr = repository.findAll();
        for (Library library : itr) {
            SubLessonDto subLessonDto = new SubLessonDto();
            subLessonDto.setId(library.getId());
            subLessonDto.setTitle(library.getSubLessonId().getTitle());
            LibraryDto libraryDto = new LibraryDto(library.getId(), library.getType(),
                    library.getName(), subLessonDto);
            list.add(libraryDto);

        }
        return list;
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
