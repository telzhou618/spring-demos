package com.example.aspect;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author zhougaojun
 */
@Slf4j
@Aspect
@Component
public class LogAspect {

    public LogAspect() {
        log.info("实例化 LogAspect");
    }

    @Pointcut("execution(public * com.example.service.*.*(..))")
    public void pointcut() {
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        log.info("@around 参数 ==> {}", JSON.toJSONString(method.getParameters()));
        Object object = joinPoint.proceed();
        log.info("@around 返回 <== {}", JSON.toJSONString(object));
        return object;
    }

    @Before("pointcut()")
    public void before() {
        log.info("@before");
    }

    @After("pointcut()")
    public void after() {
        log.info("@after");
    }

}
