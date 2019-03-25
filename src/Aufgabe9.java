import java.util.Arrays;

public class Aufgabe9 {
    public static void main(String[] args) {
        double[][] a = {{1,2,3}, {3,4,5}};
        double[][] b = {{5,6}, {7,8}, {9,10}};
        /*double[][] product = {{0,0}, {0,0}};

        for (int i = 0; i < a.length; i++) {
            double sum = 0;
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i].length; k++) {
                    sum += a[i][k]*b[k][j];
                }
                product[i][j] = sum;
                sum = 0;
            }
        }
        System.out.println(Arrays.deepToString(product));
        System.out.println("Alte Mathode done!");*/
        System.out.println("Neue Methode: " + Arrays.deepToString(matrixMultiplication(a, b)));
    }

    public static double[][] matrixMultiplication(double[][] matrixA, double[][] matrixB) throws IllegalArgumentException {
        //In dieser Schleife wird überprüft, ob die übergebenen Arrays gültige Matrizen darstellen
        for (double[] b : matrixB) {
            if (b.length != matrixA.length) {
                throw new IllegalArgumentException("Die Anzahl der Zeilen von Matrix a ( " + matrixA.length + " ) entspricht nicht der Anzahl der Zeilen von Matrix b ( " + b.length + " )! Eine Matrixmultiplikation ist in diesem Fall nicht definiert!");
            }
        }
        //Wenn die Matrizen gültig sind wird ein Ausgabe Array der passenden Dimension erstellt.
        double[][] ergebnis = new double[matrixB[0].length][matrixA.length];
        for (int i = 0; i < ergebnis[0].length; i++) { //Zeilen der Ergebnismatrix nacheinander durchiterieren
            for (int j = 0; j < ergebnis.length; j++) { //Spalten der Ergebnismatrix nacheinander durchiterieren
                //Im folgenden der Code um das Ergebnis je Feld zu berechnen
                double sum = 0.0;
                for (int m = 0; m < matrixA.length; m++) {
                    sum+=matrixA[m][i]*matrixB[j][m];
                }
                ergebnis[i][j] = sum;
            }
        }
        return ergebnis;
    }
}

// [[58.0, 76.0], [76.0, 100.0]]
