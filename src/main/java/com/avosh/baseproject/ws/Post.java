/*
 * ******************************************************************************
 *  * Created by Alireza Amirkhani 2022
 *  *****************************************************************************
 */

package com.avosh.baseproject.ws;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ws")
public class Post {
    @PostMapping("/post")
    public void getPost(@RequestHeader("Token") String token,@RequestBody String body){

    }
}
