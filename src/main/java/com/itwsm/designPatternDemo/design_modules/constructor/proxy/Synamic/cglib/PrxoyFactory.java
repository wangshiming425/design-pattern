package com.itwsm.designPatternDemo.design_modules.constructor.proxy.Synamic.cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class PrxoyFactory implements MethodInterceptor {
    public Transtation getProxyObject() {
        //创建Enhancer对象,类似于JDK代理中的Proxy类
        Enhancer enhancer=new Enhancer();
        //设置父类字节码对象
        enhancer.setSuperclass(Transtation.class);
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        Transtation object = (Transtation)enhancer.create();
        return object;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("before method");
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("after finish");
        return result;
    }
}
