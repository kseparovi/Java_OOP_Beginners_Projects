package WhileAndDoWhileExamples;

public class main {
    public static void main(String[] args) {


        int count = 0;
        while (count < 5) {

            System.out.println("First while count behind counter : " + count);
            count++;
            //da smo stavili count++ prije println onda bi krenulo od broja 1,
            // a ovako prvo izvrsava println, onda inkrementira i vraca se u while petlju

        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

        count = 0;
        while (true) {
            if (count == 6) { //kada dodje do broja 6 prekida i ne izbacuje nista vise
                break;

            }

            System.out.println("Second while loop example " + count);
            count++;
        }
        count = 0;
        //kod do whuke petlje se uvijek izvrsi barem jednom petlja,
        // da smo stavili count = 5 zavrsili bi smo u loopu jer bi samo preskovilo !=5 uvjet
        do {
            System.out.println("Do while loop " + count);
            count++;
        } while (count != 5);


        count = 0;
        for (count = 0; count <= 5; count++) {
            System.out.println("For loop counter" + count);

        }


    }


}
