package com.itwsm.designPatternDemo.design_modules.creator.factory.factory_method;

public class PieChartFactory extends Factory{
    @Override
    Chart createChart() {
        return new PieChart();
    }
}
