package com.itwsm.designPatternDemo.design_modules.factory.abstract_factory;

public class ChainGame implements Game{
    @Override
    public void play() {
        System.out.println("中国游戏");
    }
}
