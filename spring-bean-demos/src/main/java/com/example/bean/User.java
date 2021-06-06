package com.example.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author jameszhou
 */
@Getter
@Setter
@Service
public class User {

    private Integer id;
    private String name;
}
