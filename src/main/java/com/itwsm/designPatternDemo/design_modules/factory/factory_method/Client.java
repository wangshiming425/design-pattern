package com.itwsm.designPatternDemo.design_modules.factory.factory_method;

public class Client {
    public static void main(String[] args) {
        Factory factory=new LineChartFactory();
        factory.createChart().display();
    }
}
