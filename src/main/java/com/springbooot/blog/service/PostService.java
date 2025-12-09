package com.springbooot.blog.service;

import com.springbooot.blog.payload.PostDto;
import com.springbooot.blog.payload.PostResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto,long id);

    void deletePostById(long id);

    List<PostDto> getAllPosts();
}
