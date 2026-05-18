package com.itwsm.designPatternDemo.design_modules.creator.factory.abstract_factory;

//抽象工厂模式,每个具体工厂以产品族为一个维度
public class Client {
    public static void main(String[] args) {
        Factory factory=new ChinaFactory();
        factory.createChart().display();
        factory.createGame().play();
    }
}
