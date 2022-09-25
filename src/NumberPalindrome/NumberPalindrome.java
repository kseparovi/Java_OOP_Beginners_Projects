package NumberPalindrome;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(151));

        System.out.println(151 % 10);
        System.out.println(0 * 10 + 1);
        System.out.println(151 / 10);
        System.out.println("*****************");
        System.out.println(15 % 10);
        System.out.println(1 * 10 + 5);
        System.out.println(15 / 10);
        System.out.println("******************");
        System.out.println(1 % 10);
        System.out.println(15 * 10 + 1);
        System.out.println(1 / 10);


    }


    public static boolean isPalindrome(int number) {

        int num = number;
        int reverse = 0;
        int lastDigit = 0;
        while (num > 0 || num < 0) {
            lastDigit = num % 10; //zadnja brojka = ako je broj 151%10 = 1, 5 , 1
            reverse = reverse * 10 + lastDigit; //obrnuto = 0*10+1 = 1, 15, 151
            num /= 10; // 151/10 = 15, 1 , 0

            //^ vracamo se gore u petlju

        }

        if (reverse == number) {


            return true;
        } else {
            return false;
        }


    }


}

