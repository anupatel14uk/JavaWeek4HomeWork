package javaweek4homework;

/**
 * Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */

public class SharedDigit13 {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
    }

    public static boolean hasSharedDigit(int first, int second){
        if(first >= 10 && first <=99 && second >=10 && second<= 99){
            int testFirstNumber = first;
            while (testFirstNumber != 0) {
                int testSecondNumber = second;
                while (testSecondNumber != 0) {
                    if ((testFirstNumber % 10) == (testSecondNumber % 10)) {
                        return true;
                    }
                    testSecondNumber /= 10;
                }
                testFirstNumber /= 10;
            }
            return false;
        }else{
            return false;
        }
    }

}
