package com.itwsm.designPatternDemo.design_modules.creator.factory.factory_method;


public class HitrogremChart implements Chart {
    @Override
    public void display() {
        System.out.println("绘制了柱状图");
    }
}
