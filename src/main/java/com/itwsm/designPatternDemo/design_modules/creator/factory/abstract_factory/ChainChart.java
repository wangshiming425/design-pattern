package com.itwsm.designPatternDemo.design_modules.creator.factory.abstract_factory;

public class ChainChart implements Chart{
    @Override
    public void display() {
        System.out.println("金山图表");
    }
}
