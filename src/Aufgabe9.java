import java.util.Arrays;

public class Aufgabe9 {
    public static void main(String[] args) {
        double[][] a = {{1,2}, {3,4}};
        double[][] b = {{5,6}, {7,8}};
        System.out.println(Arrays.deepToString(matrixMultiplication(a, b)));
    }

    private static double[][] matrixMultiplication(double[][] matrixA, double[][] matrixB) throws IllegalArgumentException {
        //In dieser Schleife wird überprüft, ob die übergebenen Arrays gültige Matrizen darstellen
        for (double[] a : matrixA) {
            if (a.length != matrixB.length) {
                throw new IllegalArgumentException("Die Anzahl der Zeilen von Matrix a ( " + matrixB.length + " ) entspricht nicht der Anzahl der Zeilen von Matrix b ( " + a.length + " )! Eine Matrixmultiplikation ist in diesem Fall nicht definiert!");
            }
        }
        //Wenn die Matrizen gültig sind wird ein Ausgabe Array der passenden Dimension erstellt.
        double[][] ergebnis = new double[matrixA.length][matrixB[0].length];
        for (int i = 0; i < ergebnis.length; i++) { //Spalten der Ergebnismatrix nacheinander durchiterieren
            for (int j = 0; j < ergebnis[0].length; j++) { //Zeilen der Ergebnismatrix nacheinander durchiterieren
                //Im folgenden der Code um das Ergebnis je Feld zu berechnen
                double sum = 0.0;
                for (int m = 0; m < matrixA[0].length; m++) {
                    sum+=matrixA[i][m]*matrixB[m][j];
                }
                ergebnis[i][j] = sum;
            }
        }
        return ergebnis;
    }
}