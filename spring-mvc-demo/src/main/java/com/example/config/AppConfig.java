package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author zhougaojun
 */
@Configuration
@ComponentScan("com.example")
@EnableTransactionManagement
@EnableWebMvc
public class AppConfig {
}
