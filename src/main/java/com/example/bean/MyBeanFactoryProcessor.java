package com.example.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author jameszhou
 */
@Component
public class MyBeanFactoryProcessor implements BeanFactoryPostProcessor {

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        System.out.print("BeanDefinitionCount ->" + beanFactory.getBeanDefinitionCount());
        System.out.println(",BeanDefinitionNames ->" + Arrays.toString(beanFactory.getBeanDefinitionNames()));
    }
}
