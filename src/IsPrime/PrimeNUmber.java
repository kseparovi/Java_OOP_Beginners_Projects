package IsPrime;

public class PrimeNUmber {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("This is prime number " + i);
                if (count == 5) {
                    System.out.println("Exiting loop!");
                    break;

                }

            }
        }
    }


    public static boolean isPrime(int num) { //method

        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }

}
