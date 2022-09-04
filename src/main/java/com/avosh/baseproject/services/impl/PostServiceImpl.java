/*******************************************************************************
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 ******************************************************************************/

package com.avosh.baseproject.services.impl;

import com.avosh.baseproject.conf.CustomUserDetail;
import com.avosh.baseproject.dto.PostDto;
import com.avosh.baseproject.dto.UserDto;
import com.avosh.baseproject.entity.Post;
import com.avosh.baseproject.entity.SecUser;
import com.avosh.baseproject.excptions.BaseException;
import com.avosh.baseproject.repository.PostRepository;
import com.avosh.baseproject.services.PostService;
import com.avosh.baseproject.util.Empty;
import org.apache.log4j.Logger;
import org.primefaces.shaded.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    private static final Logger log = Logger.getLogger(PostServiceImpl.class);
    @Autowired
    PostRepository repository;



    @Override
    public void save(PostDto dto) {
        try {
            CustomUserDetail auth = (CustomUserDetail) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            Post post = new Post();
            post.setPost(dto.getPost());
            post.setSecUserId(new SecUser(auth.getSecUser().getId()));
            post.setBrief(dto.getBrief());
            post.setTitle(dto.getTitle());
            if(Empty.isNotEmpty(dto.getPhoto())){
                byte[] img =IOUtils.toByteArray(dto.getPhoto());
                post.setPhoto(img);
            }
            post.setType(dto.getCategory());
            post.setCreateDatetime(dto.getCreateDateTime());
            if(Empty.isNotEmpty(dto.getId())){
                post.setId(dto.getId());
            }
            repository.save(post);
        } catch (IOException e) {
            throw new BaseException(e);
        }

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
