package com.example.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author zhougaojun
 */
@Getter
@Setter
@ToString
public class User implements Serializable {

    private static final long serialVersionUID = -2248190721476487645L;

    private Integer id;
    private String username;
    private String password;
}
