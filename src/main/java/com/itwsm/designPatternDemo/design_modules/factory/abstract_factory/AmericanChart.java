package com.itwsm.designPatternDemo.design_modules.factory.abstract_factory;

public class AmericanChart implements Chart{
    @Override
    public void display() {
        System.out.println("美国OFFICE");
    }
}
