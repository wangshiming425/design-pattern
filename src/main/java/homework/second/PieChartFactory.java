package homework.second;

public class PieChartFactory implements Factory{
    @Override
    public Chart getChart() {
        return new PieChart();
    }
}
