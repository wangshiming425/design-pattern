package com.itwsm.designPatternDemo.design_modules.constructor.proxy.Synamic.jdk;

public class Client {
    public static void main(String[] args) {
        SendMessage proxyObject = new ProxyFactory().getProxyObject();
        proxyObject.send();
        System.out.println(proxyObject.getClass());
        while (true){}
    }
}
