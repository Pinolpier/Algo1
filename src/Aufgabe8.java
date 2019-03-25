import java.util.Arrays;

public class Aufgabe8 {
    public static void main(String[] args) {
        double[][] a = {{1,2}, {3,4}, {5,6}};
        double b = 2;

        double[][] solution = scalarMultiplication(a, b);
        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(solution));
    }

    private static double[][] scalarMultiplication(double[][] a, double b) {
        double[][] solution = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                solution[i][j] = a[i][j] * b;
            }
        }
        return solution;
    }
}
