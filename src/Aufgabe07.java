import java.util.Arrays;

public class Aufgabe07 {
    public static void main(String[] args) {
        double[][] test = {{1,2},{10,20},{-5,5}};
        System.out.println(Arrays.toString(arrayAverage(test)));
    }

    private static double[] arrayAverage(double[][] input) {
        double[] output = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            double[] j = input[i];
            for (double k : j) {
                output[i] += k / j.length;
            }
        }
        return output;
    }
}
