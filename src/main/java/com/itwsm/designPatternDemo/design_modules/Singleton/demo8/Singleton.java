package com.itwsm.designPatternDemo.design_modules.Singleton.demo8;

public class Singleton {
    private static boolean flag=false;
    private Singleton(){
        if(instance!=null){
            throw new RuntimeException("不能创建多个实例");
        }
    }

    private static Singleton instance;

    static {
        instance=new Singleton();
    }
    public static Singleton getInstance(){
        return instance;
    }
}
