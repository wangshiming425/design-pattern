package homework.second;

public class HistogramChartFactory implements Factory{
    @Override
    public Chart getChart() {
        return new HsitogramChart();
    }
}
