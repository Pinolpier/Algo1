import java.util.Arrays;

public class Aufgabe06 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reversed = reverseArray(original);
        System.out.println(Arrays.toString(reversed));
    }

    private static int[] reverseArray(int[] original) {
        int[] reversed = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[reversed.length - 1 - i] = original[i];
        }
        return reversed;
    }
}
