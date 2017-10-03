package temp;

/**
 * Created by user on 23.01.2017.
 */
public class NthSeries {

    public static String seriesSum(int n) {
        // Happy Coding ^_^
        double result = 0;

        for(int i = 0; i < n; i++) {
            result = result + 1.0 / (1 + 3 * i);
        }

        return String.format("%.2f", result);
    }


    public static void main(String[] args) {
        System.out.println(NthSeries.seriesSum(5));
    }

}