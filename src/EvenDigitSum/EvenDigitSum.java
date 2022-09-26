package EvenDigitSum;

import java.util.Scanner;

public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(458678));


    }

    public static int getEvenDigitSum(int number) {
        int num = number;
        int sum = 0;
        int lastDigit = 0;

        if (number >= 0) {
            while (number > 0) {
                lastDigit = number % 10;
                if (lastDigit % 2 == 0) {
                    sum += lastDigit;
                }
                number /= 10;
            }

            return sum;
        }
        System.out.println("Invalid input:");
        return -1;
    }
}





