package com.itwsm.designPatternDemo.design_modules.Singleton.demo3;

public class Test {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        Singleton singleton1=Singleton.getInstance();
        System.out.println(singleton1==singleton);
    }
}
