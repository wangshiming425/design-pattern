package com.itwsm.designPatternDemo.design_modules.factory.config_factory;

public class LineChart implements Chart{
    @Override
    public void display() {
        System.out.println("我是折线图");
    }
}
