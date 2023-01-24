package com.avosh.baseproject.ws.model;

import java.util.List;

public class PostResponse extends Response {
    List<Post> post;

    public List<Post> getPost() {
        return post;
    }

    public void setPost(List<Post> post) {
        this.post = post;
    }
}
