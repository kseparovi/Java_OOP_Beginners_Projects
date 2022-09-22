package LeapYearCalculator;

public class LeapYear {

    public static boolean isLeapYear(int year) {

        if (year <= 0 || year >= 9999) {
            return false;
        }

        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {  //svaka godina koja je djeljiva sa 4 tj ostatak pri djeljenju je 0 je prijestupna godina...npr 2024
            return true;
        } else {
            return false;
        }


    }


}


