package com.example;

import com.example.mapper.StudentMapper;
import com.example.mapper.TeacherMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/** Spring 扫描 mapper 接口生成动态代理，注入到spring容器
 *  1. 实现自定义的扫描器扫描扫描mapper接口，转为bean定义,spring默认的扫描器不会扫描接口。
 *  2. 为每个接口动态代理生成实现类，把实现类注册到spring容器
 * @author jameszhou
 */
public class ApplicationMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example");
        System.out.println(context.getBean(TeacherMapper.class));
        System.out.println(context.getBean(StudentMapper.class));
    }
}
