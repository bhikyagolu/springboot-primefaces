/*
 * ******************************************************************************
 *  * Created by Alireza Amirkhani 2022
 *  *****************************************************************************
 */

package com.avosh.baseproject.ws;

import com.avosh.baseproject.dto.NewsDto;
import com.avosh.baseproject.dto.PostDto;
import com.avosh.baseproject.enums.ResultCodsEnum;
import com.avosh.baseproject.excptions.TokenIsNotValidException;
import com.avosh.baseproject.services.PostService;
import com.avosh.baseproject.services.TokenService;
import com.avosh.baseproject.ws.model.News;
import com.avosh.baseproject.ws.model.Post;
import com.avosh.baseproject.ws.model.PostRequest;
import com.avosh.baseproject.ws.model.PostResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ws")
public class PostWs extends BaseWs {
    @Autowired
    private PostService postService;
    @Autowired
    private TokenService tokenService;

    @PostMapping("/post")
    public ResponseEntity getPost(@RequestBody PostRequest body) {
        PostResponse response = new PostResponse();
        HttpStatus httpStatus = HttpStatus.OK;
        try {

            Pageable paging = PageRequest.of(body.getPage(), body.getSize());
            List<PostDto> res = postService.retrieveAll(paging);
            List<Post> postList = new ArrayList<>();
            for (PostDto dto:res) {
                Post post = new Post();
                post.setBrif(dto.getBrief());
                post.setDetail(dto.getPost());
                post.setTitle(dto.getTitle());
                post.setDateTime(dto.getCreateDateTime());
                postList.add(post);
            }
            response.setPost(postList);
            response.setResultCode(ResultCodsEnum.SUCCESS.getCode());
            response.setResultDescription(ResultCodsEnum.SUCCESS.getDescription());
            httpStatus = (ResultCodsEnum.SUCCESS.getHttpStatus());
        } catch (TokenIsNotValidException e) {
            response.setResultCode(ResultCodsEnum.TOKEN_NOT_VALID.getCode());
            response.setResultDescription(ResultCodsEnum.TOKEN_NOT_VALID.getDescription());
            httpStatus = (ResultCodsEnum.TOKEN_NOT_VALID.getHttpStatus());
        } catch (Exception e) {
            response.setResultCode(ResultCodsEnum.UNKNOWN_ERROR.getCode());
            response.setResultDescription(ResultCodsEnum.UNKNOWN_ERROR.getDescription());
            httpStatus = (ResultCodsEnum.UNKNOWN_ERROR.getHttpStatus());
        } finally {
            return new ResponseEntity(response, httpStatus);
        }
    }
}