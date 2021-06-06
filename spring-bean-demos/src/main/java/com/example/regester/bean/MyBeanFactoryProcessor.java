package com.example.regester.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**  BeanFactoryPostProcessor 可以得到所有bean 的 BeanDefinition, 可以随性所欲的修改它
 * @author jameszhou
 */
@Component
public class MyBeanFactoryProcessor implements BeanFactoryPostProcessor {

    public MyBeanFactoryProcessor() {
        System.out.println("实例化 BeanFactoryPostProcessor");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("BeanDefinitionCount ->" + beanFactory.getBeanDefinitionCount());
        System.out.println("BeanDefinitionNames ->" + Arrays.toString(beanFactory.getBeanDefinitionNames()));
    }
}
