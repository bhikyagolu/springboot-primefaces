/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.services.impl;

import com.avosh.baseproject.conf.CustomUserDetail;
import com.avosh.baseproject.dto.NewsDto;
import com.avosh.baseproject.dto.PostDto;
import com.avosh.baseproject.dto.UserDto;
import com.avosh.baseproject.entity.News;
import com.avosh.baseproject.entity.Post;
import com.avosh.baseproject.entity.SecUser;
import com.avosh.baseproject.repository.PostRepository;
import com.avosh.baseproject.services.PostService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    private static final Logger log = Logger.getLogger(PostServiceImpl.class);
    @Autowired
    PostRepository repository;



    @Override
    public void save(PostDto dto) {
        CustomUserDetail auth = (CustomUserDetail) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Post post = new Post();
        post.setPost(dto.getPost());
        post.setSecUserId(new SecUser(auth.getSecUser().getId()));
        post.setBrief(dto.getBrief());
        post.setTitle(dto.getTitle());
        post.setType(dto.getCategory());
        post.setCreateDatetime(dto.getCreateDateTime());
        repository.save(post);

    }

    @Override
    public List<PostDto> retrieveAll() {
        List<PostDto> list = new ArrayList<>();
        Iterable<Post> itr = repository.findAll();
        for (Post post : itr) {
            PostDto postDto = new PostDto();
            postDto.setCategory(post.getType());
            postDto.setPost(post.getPost());
            postDto.setTitle(post.getTitle());
            postDto.setBrief(post.getBrief());
            postDto.setPhoto(post.getPhoto());
            postDto.setCreateDateTime(post.getCreateDatetime());
            UserDto userDto = new UserDto();
            userDto.setId(post.getSecUserId().getId());
            userDto.setFamily(post.getSecUserId().getFamily());
            userDto.setName(post.getSecUserId().getName());
            postDto.setUser(userDto);
            postDto.setId(Long.valueOf(post.getId()));
            list.add(postDto);
        }
        return list;
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
