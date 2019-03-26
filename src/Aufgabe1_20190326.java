public class Aufgabe1_20190326 {
    public static void main(String[] args) {
        System.out.println(toDecimal("z", 46));
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
                    result += (letter-48) * (int) Math.pow(base, i);
                } else {
                    letter = Character.toLowerCase(letter);
                    if (letter >= 97 && letter <= 97 + base - 10) {
                        result += (letter-87) * (int) Math.pow(base, i);
                    } else {
                        System.out.println("Nicht erlaubter Character: " + letter + " ist ignoriert und als 0 betrachtet worden!");
                    }
                }
            }
        }
        return result;
    }
}
