public class Aufgabe02 {
    public static void main(String[] args) {
        int highestN = 13;
        int nMinus2 = 0, nMinus1 = 1;
        long start = System.nanoTime();
        String recursive = "0, 1, " + fibonacciRecursive(highestN, nMinus1, nMinus2);
        long elapsed = System.nanoTime() - start;
        System.out.println("Fibonacci-Folge rekursiv: " + recursive);
        System.out.println("Berechnet in ca. " + elapsed + " Nanosekunden");
        start = System.nanoTime();
        String iterative = "0, 1, " + fibonacciIterative(highestN, nMinus1, nMinus2);
        elapsed = System.nanoTime() - start;
        System.out.println("Fibonacci-Folge iterativ: " + iterative);
        System.out.println("Berechnet in ca. " + elapsed + " Nanosekunden");

    }

    /*Effizienz der Rekursion:
    Vermutlich ist die Rekursion auf Grund des CallStacks für hohe Grenzen ineffizienter
     */
    private static String fibonacciRecursive(int highestN, int nMinus1, int nMinus2) {
        if (highestN == 0) {
            return String.valueOf(nMinus1+nMinus2);
        } else {
            return (nMinus1+nMinus2) +  ", " + fibonacciRecursive(highestN - 1, nMinus1 + nMinus2, nMinus1);
        }
    }


    private static String fibonacciIterative(int highestN, int nMinus1, int nMinus2) {
        String result = String.valueOf(nMinus1+nMinus2);
        for (int i = 0; i < highestN; i++) {
            nMinus1 += nMinus2;
            nMinus2 = nMinus1 - nMinus2;
            result += ", " + (nMinus1+nMinus2);
        }
        return result;
    }
}
