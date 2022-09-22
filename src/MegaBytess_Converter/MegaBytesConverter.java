package MegaBytess_Converter;

public class MegaBytesConverter {



   public static void printMegaBytesAndKiloBytes(int kiloBytes){
       int megabytes = (kiloBytes / 1024);
       int rest = (kiloBytes%  1024);
       if(kiloBytes >= 0){
           System.out.println(kiloBytes + "KB = " + megabytes + "MB and " + rest + "KB");
       }else{
           System.out.println("Invalid Value");
       }





   }
}
