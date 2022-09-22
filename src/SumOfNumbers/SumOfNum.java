package SumOfNumbers;

//suma brojeva djeljivih sa 3 i 5

public class SumOfNum {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 300; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++; //prolazak kroz petlju
                sum += i; //suma krece od nule i pamti svaki broj koji prodje kroz petlju te mu kroz svaki prolaze nadodaje broj u sumu
                System.out.println("Found number: " + i);
            }


            if (count == 5) { //oredjujemo do koliko puta ce se petlja izvrtiti
                break;
            }


        }
        System.out.println("Sum = " + sum);


    }


}




