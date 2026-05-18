package com.itwsm.designPatternDemo.design_modules.creator.Singleton.demo5;

public class Test {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton s =Singleton.getInstance();
        System.out.println(s==instance);
    }
}
