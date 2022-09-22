package SecondsMinutes;

public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(68, 59)); //u prvoj metodi paramtetri su minute i sekunde
        System.out.println(getDurationString(60)); //u drugoj metodi smo parametar stavili na seconds

    }//main metoda u kojoj izvrsavamo program


    private static String getDurationString(long minutes, long seconds) {


        if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
            return "Invalid value"; //u metodi smo naveli string zato je povratna vrijednos u stringu u suprotnom bi imali error

        }

        long hours = minutes / 60;
        long remaining = minutes % 60; //preostale minute

        return hours + " h is " + remaining + " min and  " + seconds + " sec"; //izgled kako ce kad pozovemo metodu u mainu se ispisat

    }

    private static String getDurationString(long seconds) { //method overload

        if (seconds < 0) { //provjera inputa
            return "Invalid input";
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);

    }

}
