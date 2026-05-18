package com.itwsm.designPatternDemo.design_modules.creator.factory.simple_factory;

public class HitrogremChart implements Chart{
    @Override
    public void display() {
        System.out.println("绘制了柱状图");
    }
}
