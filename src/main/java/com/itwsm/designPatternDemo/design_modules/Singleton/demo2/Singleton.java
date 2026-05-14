package com.itwsm.designPatternDemo.design_modules.Singleton.demo2;

//用静态代码块初始化
public class Singleton {
    private Singleton(){}

    private static  Singleton singleton;

    //用静态代码块给赋值
    static {
        System.out.println("静态代码块执行");
        singleton=new Singleton();
    }

    public static Singleton getSingleton(){
        return singleton;
    }

}
