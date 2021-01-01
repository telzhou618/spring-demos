package com.example.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author jameszhou
 */
@Component
public class Teacher implements FactoryBean<Teacher> {

    public Teacher getObject() throws Exception {
        return new Teacher();
    }

    public Class<?> getObjectType() {
        return Teacher.class;
    }
}
