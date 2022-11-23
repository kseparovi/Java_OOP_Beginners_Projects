package SharedDigit;

import java.util.Scanner;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(isSharedDigit(89,88));




    }

    public static boolean isSharedDigit(int first, int second) {


        if ((first >= 10 && first <= 99) && (second >= 10 && second <= 99)) {

            int firstNumberLastDigit = first % 10;
            int secondNumberLastDigit = second % 10;
            first /= 10;
            second /= 10;
            int firstNumberFirstDigit = first;
            int secondNumberFirstDigit = second;

            return ((firstNumberFirstDigit == secondNumberFirstDigit) || (firstNumberFirstDigit == secondNumberLastDigit) || (firstNumberLastDigit == secondNumberFirstDigit) || (firstNumberLastDigit == secondNumberLastDigit));
        }


        return false;


    }


}

