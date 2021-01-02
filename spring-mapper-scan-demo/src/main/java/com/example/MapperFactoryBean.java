package com.example;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**  动态代理生成 mapper 实现类
 * @author jameszhou
 */
public class MapperFactoryBean<T> implements FactoryBean<T> {

    private Class<T> mapperInterface;

    public MapperFactoryBean(Class<T> mapperInterface) {
        System.out.println("==============");
        this.mapperInterface = mapperInterface;
    }

    @Override
    public T getObject() {
        return (T) Proxy.newProxyInstance(
                this.mapperInterface.getClassLoader(),
                new Class[]{this.mapperInterface},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        return method.invoke(mapperInterface, args);
                    }
                });
    }

    @Override
    public Class<T> getObjectType() {
        return mapperInterface;
    }

}
