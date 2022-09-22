package MinutesToYears;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(1763352L);
    }


    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            long days = hours / 24;
            long restOfDays = days % 365;
            long year = days / 365;


            System.out.println(minutes + " min = " + year + " y and " + restOfDays + " d");


        }

    }
}
