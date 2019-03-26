public class Aufgabe04 {
    public static void main(String[] args) {
        int[] test = {1,2,3,4};
        System.out.println(arraySum(test));
    }

    private static int arraySum(int[] input) {
        int sum = 0;
        for (int i : input) {
            sum += i;
        }
        return sum;
    }
}