package com.itwsm.designPatternDemo.design_modules.creator.factory.simple_factory;

public class PieChart implements Chart{
    @Override
    public void display() {
        System.out.println("绘制了饼状图");
    }
}
