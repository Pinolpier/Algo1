import java.util.ArrayList;

public class Aufgabe1_20190326 {
    public static void main(String[] args) {
        System.out.println(toBase(toDecimal("1256f", 16), 16));
        System.out.println(toBase(toDecimal("11011011", 10), 10));
    }
    private static int toDecimal(String number, int base) {
        char letter;
        int result = 0;
        boolean smallerDecimal = (base <= 10);
        for (int i = number.length() - 1; i > -1; i--) {
            letter = number.charAt(i);
            if (smallerDecimal) {
                if (letter >= 48 && letter <= 48 + base) {
                    result += (letter-48) * (int) Math.pow(base, number.length() - 1 - i);
                } else {
                    System.out.println("Nicht erlaubter Character: " + letter + " ist ignoriert und als 0 betrachtet worden!");
                }
            } else {
                if (letter >= 48 && letter <= 57) {
                    result += (letter-48) * (int) Math.pow(base, number.length() - 1 - i);
                } else {
                    letter = Character.toLowerCase(letter);
                    if (letter >= 97 && letter <= 97 + base - 10) {
                        result += (letter-87) * (int) Math.pow(base, number.length() - 1 - i);
                    } else {
                        System.out.println("Nicht erlaubter Character: " + letter + " ist ignoriert und als 0 betrachtet worden!");
                    }
                }
            }
        }
        return result;
    }

    private static String toBase(int decimal, int base) {
        ArrayList<Integer> reste = new ArrayList<>();
        int rest;
        while (decimal != 0) {
            rest = decimal % base;
            reste.add(rest);
            decimal = (decimal) / base;
        }
        String result = "";
        for (Integer i : reste) {
            if (i <= 9) {
                result += i;
            } else {
                result += (char) (97 + i - 10);
            }
        }
        //System.out.println(result);
        String reversed = "";
        for (int i = result.length() - 1; i >= 0; i--) {
            reversed += result.charAt(i);
        }
        return reversed;
    }
}
