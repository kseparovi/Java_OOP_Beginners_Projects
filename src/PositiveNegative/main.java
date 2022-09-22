package PositiveNegative;

public class main {
    public static void main(String[] args) {
        positiveNegative(0);

    }
    public static void positiveNegative( int number){

        if (number > 0){
            System.out.println("Number is positive");
        } else if (number == 0){
            System.out.println("Number is zero!");
        } else if (number < 0){
            System.out.println("Number is negative");

        } else {
            System.out.println("YOu wrote wrong characher");
        }





    }
}


