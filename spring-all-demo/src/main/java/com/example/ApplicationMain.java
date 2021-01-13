package com.example;

import com.example.config.ConfigMain;
import com.example.ioc.Student;
import com.example.ioc.User;
import com.example.mapper.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jameszhou
 */
public class ApplicationMain {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigMain.class);
        System.out.println(context.getBean(User.class));
        System.out.println(context.getBean(Student.class));

        System.out.println(context.getBean(UserMapper.class).selectById(1));

    }
}
