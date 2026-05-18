package com.itwsm.designPatternDemo.design_modules.creator.factory.abstract_factory;

public class ChinaFactory implements Factory{
    @Override
    public Chart createChart() {
        return new ChainChart();
    }

    @Override
    public Game createGame() {
        return new ChainGame();
    }
}
