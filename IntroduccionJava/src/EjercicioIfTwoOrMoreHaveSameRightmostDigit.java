public class EjercicioIfTwoOrMoreHaveSameRightmostDigit {

    /*
    Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7

        lastDigit(23, 19, 13) --true
        lastDigit(23, 19, 12) -- false
        lastDigit(23, 19, 3)-- true
     */

        public static boolean lastDigit(int a, int b, int c) {
            int lastDigitA = a % 10;
            int lastDigitB = b % 10;
            int lastDigitC = c % 10;

            return (lastDigitA == lastDigitB) || (lastDigitA == lastDigitC) || (lastDigitB == lastDigitC);
        }

        public static void main(String[] args) {
            // Ejemplos de uso:
            System.out.println(lastDigit(23, 19, 13)); // true
            System.out.println(lastDigit(23, 19, 12)); // false
            System.out.println(lastDigit(23, 19, 3));  // true
        }


}
