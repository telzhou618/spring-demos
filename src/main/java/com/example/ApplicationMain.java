package com.example;

import com.example.bean.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/** Spring bean 有多少种注入方式 ?
 *  1. @Component 方式包含(@Controller,@Service,@Repository)
 *  2. @Bean 工厂方式
 *  3. FactoryBean 实例化对象
 *  4. @Import 注入对象
 *  5. 实现 BeanDefinitionRegistryPostProcessor 的postProcessBeanDefinitionRegistry 注入对象
 * @author jameszhou
 */
public class ApplicationMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example");
        System.out.println(context.getBean(User.class));
        System.out.println(context.getBean(Student.class));
        System.out.println(context.getBean(Teacher.class));
        System.out.println(context.getBean(Cat.class));
        System.out.println(context.getBean(Dog.class));

    }
}
