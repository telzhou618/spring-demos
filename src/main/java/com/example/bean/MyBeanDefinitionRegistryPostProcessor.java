package com.example.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author jameszhou
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {

        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Dog.class);
        registry.registerBeanDefinition("dog", rootBeanDefinition);
    }

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }
}
