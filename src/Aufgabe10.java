import java.util.Arrays;

public class Aufgabe10 {

    public static void main(String[] args) {
        double[] bigArray = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        double maxSum = 0;
        for (int i = 0; i < bigArray.length; i++) { //Länge des SubArrays nacheinander erhööhen
            for (int j = 0; j < bigArray.length-i; j++) { //Startposition des Subarrays
                double sum = arraySum(Arrays.copyOfRange(bigArray, j, j+i));
                maxSum = (maxSum < sum) ? sum : maxSum;
            }
        }
        System.out.println(maxSum);
    }

    private static double arraySum(double[] toSumUp) {
        double sum = 0;
        for (double i : toSumUp) {
            sum += i;
        }
        return sum;
    }
}
