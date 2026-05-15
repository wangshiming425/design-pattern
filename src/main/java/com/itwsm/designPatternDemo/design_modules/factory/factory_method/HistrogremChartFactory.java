package com.itwsm.designPatternDemo.design_modules.factory.factory_method;

public class HistrogremChartFactory extends Factory{
    @Override
    Chart createChart() {
        return new HitrogremChart();
    }
}
