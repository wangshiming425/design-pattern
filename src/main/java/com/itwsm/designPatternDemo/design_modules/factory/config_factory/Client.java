package com.itwsm.designPatternDemo.design_modules.factory.config_factory;

public class Client {
    public static void main(String[] args) {
        Chart pie = SimpleFactory.createChart("pie");
        Chart pie2 = SimpleFactory.createChart("pie");
        System.out.println(pie==pie2);

    }
}
