/*******************************************************************************
 * Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.services;

import com.avosh.baseproject.dto.PostDto;
import com.avosh.baseproject.entity.Post;
import com.avosh.baseproject.repository.PostRepository;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PostService extends BaseService<PostRepository, Post, PostDto> {
    List<PostDto> retrieveAll(Pageable paging);
}
