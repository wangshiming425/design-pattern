package com.itwsm.designPatternDemo.design_modules.creator.factory.abstract_factory;

public class AmericanGame implements Game{
    @Override
    public void play() {
        System.out.println("美国游戏");
    }
}
