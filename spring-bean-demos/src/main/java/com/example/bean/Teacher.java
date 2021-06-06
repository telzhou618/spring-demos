package com.example.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author jameszhou
 */
@Component
public class Teacher implements FactoryBean<Teacher> {

    @Override
    public Teacher getObject() throws Exception {
        return new Teacher();
    }

    @Override
    public Class<?> getObjectType() {
        return Teacher.class;
    }
}
