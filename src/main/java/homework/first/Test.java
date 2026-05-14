package homework.first;

public class Test {
    public static void main(String[] args) {
        Chart chart=ChartFactory.getChart("pie");
        chart.draw();
        System.out.println("==========");
        chart=ChartFactory.getChart("histogram");
        chart.draw();
        System.out.println("============");
        chart=ChartFactory.getChart("line");
        chart.draw();;
    }
}
