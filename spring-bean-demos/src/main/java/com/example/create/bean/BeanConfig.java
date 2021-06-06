package com.example.create.bean;

import com.example.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jameszhou
 */
@Configuration
public class BeanConfig {
    @Bean
    public Student student() {
        return new Student();
    }
}
