package com.example;

import com.example.bean.Cat;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * @author zhougaojun
 */
@ComponentScan("com.example")
@Import(Cat.class)
public class AppConfig {
}
