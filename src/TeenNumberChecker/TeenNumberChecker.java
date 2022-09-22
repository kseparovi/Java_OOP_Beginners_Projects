package TeenNumberChecker;

public class TeenNumberChecker {
    public static boolean hasTeen(int fst, int sec, int trd) {
        if ((fst <= 13 || fst >= 19) && (sec <= 13 || sec >= 19) && (trd <= 13 || trd >= 19)){
            return false;

        } else {
            return true;
        }
    }

    public static boolean isTeen(int year){
        if ((year < 13 || year > 19)){
            return false;
        } else {
            return true;
        }

    }
}
