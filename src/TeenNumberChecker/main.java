package TeenNumberChecker;

import static TeenNumberChecker.TeenNumberChecker.hasTeen;
import static TeenNumberChecker.TeenNumberChecker.isTeen;

public class main {
    public static void main(String[] args) {
        boolean result = hasTeen(1,1,25);
        System.out.println(result);

        boolean res = isTeen(1);
        System.out.println(res);
    }
}
