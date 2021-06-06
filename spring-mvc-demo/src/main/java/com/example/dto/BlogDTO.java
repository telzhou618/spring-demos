package com.example.dto;

import com.example.annotation.SessionUserId;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zgj
 * @since 2021/6/3
 */
@Getter
@Setter
public class BlogDTO {

    @SessionUserId
    private Integer userId;
    private String title;
    private String content;
}
