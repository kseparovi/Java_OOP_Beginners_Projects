package EqualityPrinter;

public class IntEqualityPrinter {
    public static void main(String[] args) {
        printEqual(-1, 2, 2);


    }


    public static void printEqual(int fst, int sec, int thd) {
        if ((fst < 0) || (sec < 0) || (thd < 0)) {
            System.out.println("Invalid Value");

        } else if (fst == sec && sec == thd && thd == fst) {
            System.out.println("All numbers are equal");

        } else if ((fst != sec) && (sec != thd) && (thd != fst)) {
            System.out.println("All numbers are deferent");
        } else {
            System.out.println("Neither all are equal or different");

        }
    }
}
