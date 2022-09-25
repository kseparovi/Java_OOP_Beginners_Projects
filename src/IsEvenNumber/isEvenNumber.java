package IsEvenNumber;

//program izbacuje parne brojeve, broj koliko ih je i sumu svih parnih brojeva

public class isEvenNumber {
    public static void main(String[] args) {
        int sum = 0;
        int number = 1;
        int finishNum = 40;
        int evenNumbersFounded = 0;


        while (number <= finishNum) {
            number++;
            sum += number;

            if (!isEvenNumber(number)) { //ako nije parni broj nastavi ( preskoci). da smo stavili ako je parni, izbacilo bi samo neparne brojeve
                continue; //continue sluzi da zabodje dio koda koji smo gore naveli, dakle ako je broj neparan taj dio koda nemoj izvrsiri i ponovi petlju dalje
            }
            System.out.println(number + ". number!");


            evenNumbersFounded++;
            if (evenNumbersFounded == 5) {
                break;
            }


        }
        System.out.println("Even numbers found " + evenNumbersFounded);
        System.out.println("Sum of numbers = " + sum);


    }


    public static boolean isEvenNumber(int number) {
        if (number < 0) {
            return false;

        } else if (number % 2 == 0) {
            return true;
        }

        return false;


    }


}
