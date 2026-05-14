package homework.second;

public class LineChartFactory implements Factory{
    @Override
    public Chart getChart() {
        return new LineChart();
    }
}
