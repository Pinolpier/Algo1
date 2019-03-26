public class Aufgabe03 {
    public static void main(String[] args) {
        int a = 1029;
        int b = 1071;
        long start = System.nanoTime();
        int solution = euklidOldIterativ(a, b);
        long elapsed = System.nanoTime() - start;
        System.out.println("Nach Euklid alt iterativ: " + solution + " in ca. " + elapsed + " Nanosekunden"); //Messfehler unbekannt
        start = System.nanoTime();
        solution = euklidOldRecursive(a, b);
        elapsed = System.nanoTime() - start;
        System.out.println("Nach Euklid alt rekursiv: " + solution + " in ca. " + elapsed + " Nanosekunden"); //Messfehler unbekannt
        start = System.nanoTime();
        solution = euklidNewIterative(a, b);
        elapsed = System.nanoTime() - start;
        System.out.println("Nach Euklid neu iterativ: " + solution + " in ca. " + elapsed + " Nanosekunden"); //Messfehler unbekannt
        start = System.nanoTime();
        solution = euklidNewRecursive(a, b);
        elapsed = System.nanoTime() - start;
        System.out.println("Nach Euklid neu rekursiv: " + solution + " in ca. " + elapsed + " Nanosekunden"); //Messfehler unbekannt
        System.out.println(a + "/" + solution + "=" + a/solution + " und " + b + "/" + solution + "=" + b/solution + " Die absolute Differenz beträgt " + Math.abs(a/solution-b/solution) + " mal den ggT");
    }

    private static int euklidNewIterative(int a, int b) {
        if (a < b) { //Vertauschen, so dass a auf alle Fälle größer oder gleich b ist
            int i = a;
            a = b;
            b = i;
        }
        int c;

        while(true) {

            c = a % b;
            if (c == 0) {
                return b;
            }
            a = b;
            b = c;
        }
    }

    private static int euklidNewRecursive(int a, int b) {
        if (a < b) {
            return euklidNewRecursive(b, a);
        }
        int c = a % b;
        if (c==0) {
            return b;
        } else {
            return euklidNewRecursive(b, c);
        }

    }

    private static int euklidOldIterativ (int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    private static int euklidOldRecursive(int a, int b) {
        if (a == b) {
            return a;
        } else {
            if (a > b) {
                return euklidOldRecursive(a - b, b);
            } else {
                return euklidOldRecursive(a, b - a);
            }
        }
    }
}
