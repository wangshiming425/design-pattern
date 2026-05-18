package com.itwsm.designPatternDemo.design_modules.creator.Singleton.demo6;

public class Test {
    public static void main(String[] args) {
        Singleton s1=Singleton.INSTANCE;
        Singleton s2=Singleton.INSTANCE;
        System.out.println(s2==s1);
    }
}
