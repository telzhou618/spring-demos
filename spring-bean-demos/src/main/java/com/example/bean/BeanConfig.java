package com.example.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author jameszhou
 */
@Configuration
@Import(Cat.class)
public class BeanConfig {

    @Bean
    public Student student() {
        return new Student();
    }
}
