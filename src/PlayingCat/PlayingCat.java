package PlayingCat;

public class PlayingCat {
    public static void main(String[] args) {
        boolean res = isCatPlaying(false, 45);
        System.out.println(res);
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            }
        }
        if (!summer && ((temperature >= 25) && (temperature <= 35))) {

            return true;

        } else {
            return false;
        }


    }
}
