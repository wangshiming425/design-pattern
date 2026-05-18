package com.itwsm.designPatternDemo.design_modules.creator.factory.simple_factory;

public class ChartFactory {
    public static Chart getChart(String type){
        Chart chart=null;
        if(type.equalsIgnoreCase("histrogrem")){
            chart=new HitrogremChart();
        }else if(type.equalsIgnoreCase("pie")){
            chart=new PieChart();
        } else if (type.equalsIgnoreCase("line")) {
            chart=new LineChart();
        }else {
            throw new RuntimeException("没有这个图表类型");
        }
        return chart;
    }
}
