package com.itwsm.designPatternDemo.design_modules.creator.factory.simple_factory;

public class LineChart implements Chart{
    @Override
    public void display() {
        System.out.println("绘制了折线图");
    }
}
