package BarkingDog;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        if(hourOfDay <= 0 || hourOfDay > 23){
            return false;
        }if(((barking == true) && (hourOfDay <= 8)) || (hourOfDay >= 22)){
            return true; //if it is between 8 or 22, and dog is barking, we should wake up
        } else {
            return false;
        }


    }
}
