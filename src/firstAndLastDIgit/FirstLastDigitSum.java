package firstAndLastDIgit;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(789));
    }

    public static int sumFirstAndLastDigit(int number) {

        int num = number;
        int lastDigit = 0;
        int firstDigit = 0;
        int sum = 0;

        if(number > 0) {
            lastDigit = num % 10;
            while (number > 1) {
                number = number / 10;
                if (number == 0) {
                    break;
                }
                firstDigit = number;
            }
            sum = firstDigit + lastDigit;


            System.out.println(firstDigit + " and " + lastDigit);
            if (num <= 9) {

                sum = lastDigit + lastDigit;
                System.out.println("Sum of " + lastDigit + " and " + lastDigit + " is " + sum);

            } else if (num == 10) {
                sum = firstDigit;
            }
            return sum;


        }else if(num == 0) {
            return 0;

        }
        return -1;

    }

}
