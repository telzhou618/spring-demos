package com.example;

import com.example.entity.Blog;
import com.example.service.BlogService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author jameszhou
 */
@ComponentScan("com.example")
@EnableTransactionManagement
public class ApplicationMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationMain.class);
        BlogService blogService = context.getBean(BlogService.class);
        Blog blog = new Blog().setTitle("xxx222").setContent("xxx2222");
        System.out.println(blogService.insert(blog));
    }
}
