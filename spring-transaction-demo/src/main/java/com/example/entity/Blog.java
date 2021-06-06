package com.example.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author zhougaojun
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class Blog {

    private Integer id;
    private String title;
    private String content;
}
