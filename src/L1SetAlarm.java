package src;

public class L1SetAlarm {
    public static boolean setAlarm(boolean employed, boolean vacation) {
        if(employed == true && vacation == false){
            return true;
        }
        return false;
    }
}
