package Scanner;

import java.sql.Time;
import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);


        System.out.println("Enter your year of birth:");
        boolean hasNextInt = user_input.hasNextInt(); //ovo mora biti nakon SOUT
        // jer u suprotnom se gornji SOUT nebi izvrsio, te korisnik nebi znao sto treba unjeti u input

        if (hasNextInt) { //provjerava jel korisnik unosi integer, a ako da izvrsava donji dio koda
            int yearOfBirth = user_input.nextInt();
            user_input.nextLine(); // handle next line character (enter key)

            System.out.println("Enter your name: ");
            String name = user_input.nextLine();
            int age = 2018 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else { //ako korisnik ne unese integer izvrsi se donji dio koda
            System.out.println("Unable to parse year of birth.");
        }


        user_input.close();
    }

}
