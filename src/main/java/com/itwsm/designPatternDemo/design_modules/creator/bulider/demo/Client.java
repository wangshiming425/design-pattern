package com.itwsm.designPatternDemo.design_modules.creator.bulider.demo;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .mainboard("金士顿主板")
                .screen("三星屏幕")
                .memory("华硕内存条")
                .build();
        System.out.println(phone);

    }
}
