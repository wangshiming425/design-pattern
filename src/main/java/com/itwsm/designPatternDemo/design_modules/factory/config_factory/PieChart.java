package com.itwsm.designPatternDemo.design_modules.factory.config_factory;

public class PieChart implements Chart{
    @Override
    public void display() {
        System.out.println("我是饼状图");
    }
}
