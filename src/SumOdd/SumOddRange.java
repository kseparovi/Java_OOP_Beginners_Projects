package SumOdd;

public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(-1,100));
    }

    public static boolean isOdd(int number) {

        if (number < 0) {
            return false;

        } else if (number % 2 != 0) {
            return true;
        }

        return false;


    }

    public static int sumOdd(int start, int end) {

        int sum = 0;
        if (start > 0 && end > 0 && end >= start) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {

                    sum += i;
                    //System.out.println("This is odd number " + i);

                }


            }

            return sum;
        } else {
            return -1;
        }


    }
}
