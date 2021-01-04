package com.example.ioc;

import lombok.ToString;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author gaojun.zhou
 * @date 2021/01/04
 */
@ToString
@Component
public class Student implements EnvironmentAware {

    private Environment environment;

    public Environment getEnvironment() {
        return environment;
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
