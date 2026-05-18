package com.itwsm.designPatternDemo.design_modules.creator.factory.abstract_factory;

public class AmericanFactory implements Factory{
    @Override
    public Chart createChart() {
        return new AmericanChart();
    }

    @Override
    public Game createGame() {
        return new AmericanGame();
    }
}
