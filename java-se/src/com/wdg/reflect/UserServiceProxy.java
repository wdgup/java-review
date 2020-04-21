package com.wdg.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * User: wangdaogang
 * Date: 2020/4/20
 * Description: No Description
 */
public class UserServiceProxy implements InvocationHandler {

    private Object target;
    public UserServiceProxy(Object target){
        this.target = target;
    }

    public <T> T getProxy(){
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("userServiceProxy:");
        return method.invoke(target,args);
    }
}
