package com.example.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * @author jameszhou
 */
@Getter
@Setter
@Component
public class User {

    private Integer id;
    private String name;
}
