/*******************************************************************************
* Created by Alireza Amirkhani 2022
 ******************************************************************************/

package com.avosh.baseproject.services;

import com.avosh.baseproject.dto.PostDto;
import com.avosh.baseproject.entity.Post;
import com.avosh.baseproject.repository.PostRepository;

public interface PostService extends BaseService<PostRepository, Post, PostDto>{
}
