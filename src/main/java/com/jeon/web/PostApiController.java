package com.jeon.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.jeon.service.posts.PostsService;
import com.jeon.web.dto.PostsResponseDto;
import com.jeon.web.dto.PostsSaveRequestDto;
import com.jeon.web.dto.PostsUpdateRequestDto;

@RequiredArgsConstructor
@RestController
public class PostApiController {
    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }


    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long Id, @RequestBody PostsUpdateRequestDto requestDto){
        return postsService.update(Id,requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id){
        return postsService.findById(id);
    }



}
