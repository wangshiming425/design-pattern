package com.itwsm.designPatternDemo.design_modules.factory.factory_method;



public class PieChart implements Chart {
    @Override
    public void display() {
        System.out.println("绘制了饼状图");
    }
}
