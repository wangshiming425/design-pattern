package homework.first;

//图表工厂类
public class ChartFactory {
    public static Chart getChart(String type){
        Chart chart=null;
        if("histogram".equalsIgnoreCase(type)){
            return new HistogramChart();
        } else if ("pie".equalsIgnoreCase(type)) {
            return new PieChart();
        } else if ("line".equalsIgnoreCase(type)) {
            return new LineChart();
        }
        return chart;
    }
}
