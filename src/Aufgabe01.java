public class Aufgabe01 {
    public static void main(String[] args) {
        int limit = 5;
        System.out.println("Rekursiv: " + sumUpRecursive(limit));
        System.out.println("Iterativ: " + sumUpIterative(limit));
    }

    private static int sumUpRecursive(int limit) {
        if (limit == 1) {
            return 1;
        } else {
            return limit + sumUpRecursive(limit - 1);
        }
    }

    private static int sumUpIterative(int limit) {
        int sum = 0;
        for (int i = 1; i < limit + 1; i++) {
            sum += i;
        }
        return sum;
    }
}
