package com.itwsm.designPatternDemo.design_modules.Singleton.demo3;
//加同步锁,但效率低下
public class Singleton {
    private Singleton(){}

    //私有化成员变量
    private static Singleton instance;

    public static synchronized Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
