package com.example;

import com.example.service.OrderService;
import com.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author jameszhou
 */
public class ApplicationMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.getBean(UserService.class).getUserInfo();
        context.getBean(OrderService.class).getOrderId();
    }
}
