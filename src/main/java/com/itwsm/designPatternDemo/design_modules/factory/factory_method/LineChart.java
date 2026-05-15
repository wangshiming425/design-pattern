package com.itwsm.designPatternDemo.design_modules.factory.factory_method;



public class LineChart implements Chart {
    @Override
    public void display() {
        System.out.println("绘制了折线图");
    }
}
