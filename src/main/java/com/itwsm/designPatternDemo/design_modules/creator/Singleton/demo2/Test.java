package com.itwsm.designPatternDemo.design_modules.creator.Singleton.demo2;

public class Test {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton1 == singleton);
    }
}
