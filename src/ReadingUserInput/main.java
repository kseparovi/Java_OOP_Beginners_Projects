package ReadingUserInput;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter number: #");


        boolean hasNextInt = user_input.hasNextInt();

        if (hasNextInt) {
            int number = user_input.nextInt();
            user_input.nextLine();
            int count = 1;
            int sum = 0;

            while (count <= 10) {
                if (number > 0) {
                    sum += number;
                    count++;

                    System.out.println(sum);


                } else {
                    System.out.println("Invalid input");
                }


            }


        } else {
            System.out.println("Invalid input, try again");
        }

user_input.close();
    }
}
