package DigitSum;

public class main {
    public static void main(String[] args) {

        System.out.println("Sum of the digits is = " + sumDigit(125));


    }
    public static int sumDigit(int number) {

        if (number < 10) {
            return -1;
        }


        int sum = 0;
        while (number > 0) {
            int digit = number % 10; //cijelobrojno djeljenje ce izracunati zadnju brojku

            sum += digit; //sumi dodamo digit vrijednost

            number /= 10; //ne kuzim ovo!


        }
        return sum;
    }


}

