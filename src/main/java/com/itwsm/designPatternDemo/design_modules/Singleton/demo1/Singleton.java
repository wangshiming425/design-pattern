package com.itwsm.designPatternDemo.design_modules.Singleton.demo1;

//饿汉式类加载便初始化单例对象
public class Singleton {
    private Singleton() {
    }

    //静态私有化成员变量
    private static Singleton singleton=new Singleton();

    //提供接口对外提供这一个唯一对象
    public static Singleton getSingleton() {
        return singleton;
    }

}
