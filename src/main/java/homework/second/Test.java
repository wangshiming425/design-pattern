package homework.second;

public class Test {
    public static void main(String[] args) {
        System.out.println("展示第一个柱状图工厂");
        Factory factory=new HistogramChartFactory();
        Chart chart = factory.getChart();
        chart.show();
        System.out.println("饼状图工厂");
        Factory factory1=new PieChartFactory();
        Chart chart1 = factory1.getChart();
        chart1.show();
    }
}
