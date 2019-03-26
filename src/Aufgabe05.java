public class Aufgabe05 {
    public static void main(String[] args) {
        int[] test = {3,2,4,1};
        System.out.println(maxValue(test));
    }

    private static int maxValue(int[] input) {
        int highest = input[0];
        for (int i : input) {
            highest = (i > highest) ? i : highest;
        }
        return highest;
    }
}
