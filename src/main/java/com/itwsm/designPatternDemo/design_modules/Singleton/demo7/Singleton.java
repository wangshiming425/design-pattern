package com.itwsm.designPatternDemo.design_modules.Singleton.demo7;

import java.io.Serializable;

public class Singleton implements Serializable {
    private Singleton(){
    }

    private static Singleton singleton=new Singleton();

    public static Singleton getInstance(){
        return singleton;
    }

    public Object readResolve(){
        return singleton;
    }

}
