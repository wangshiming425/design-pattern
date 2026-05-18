package com.itwsm.designPatternDemo.design_modules.constructor.proxy.Synamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//获取代理对象的工厂类
public class ProxyFactory {
    //声明一个目标对象
    private WeChat weChat = new WeChat();

    public SendMessage getProxyObject() {
        //获得
        ClassLoader classLoader = weChat.getClass().getClassLoader();
        Class<?>[] interfaces = weChat.getClass().getInterfaces();
        SendMessage object = (SendMessage) Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("before Method");
                method.invoke(weChat,args);
                System.out.println("after finish");
                return proxy;
            }
        });
        return object;
    }
}
