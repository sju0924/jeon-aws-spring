package com.jeon.web.dto;

import lombok.Getter;
import com.jeon.domain.post.Posts;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {
    private long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;

    public PostsListResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.modifiedDate = entity.getModifiedDate();
    }
}
