package com.itwsm.designPatternDemo.design_modules.factory.factory_method;

public class PieChartFactory extends Factory{
    @Override
    Chart createChart() {
        return new PieChart();
    }
}
