package com.itwsm.designPatternDemo.design_modules.creator.factory.simple_factory;

//简单工厂模式,不属于设计模式的一种,每次新增产品都需要去工厂类中修改,违背了OCP
public class Client {
    public static void main(String[] args) {
        Chart pie = ChartFactory.getChart("pie");
        pie.display();
    }
}
