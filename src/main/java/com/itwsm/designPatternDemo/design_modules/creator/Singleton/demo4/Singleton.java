package com.itwsm.designPatternDemo.design_modules.creator.Singleton.demo4;

//双重检查锁
public class Singleton {
    private Singleton(){}

    private static Singleton instance;

    //对外提供访问方式

    public static Singleton getInstance() {
        //第一次判断,如果不为空,则返回该对象
        if(instance==null){
            //这里会出现线程安全问题,所以给这里加锁
            synchronized (Singleton.class){
                if(instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}
