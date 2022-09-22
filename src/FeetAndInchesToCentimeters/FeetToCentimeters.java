package FeetAndInchesToCentimeters;

//method overloading

public class FeetToCentimeters {
    public static void main(String[] args) {
        calculation(0, 10);
        calculation(157);
    }

    public static double calculation(double feet, double inches) {

        if (feet <= 0 && inches <= 0) {
            System.out.println("Invalid input!");
            return -1;

        }
        double centimeters = feet * 12 * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet and " + inches + " inches = " + centimeters + " centimeters!");
        return centimeters;
    }
    public static double calculation( double inches){
        if(inches < 0 ){
            return -1;

        }
        double feet = (int) inches /12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + "inches is equal to " +feet + " feet and " + remainingInches + " inches");
        return calculation(feet, remainingInches);
    }

}
