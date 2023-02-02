package src;

public class GrasshopperCheckForFactor {
    public static boolean checkForFactor(int base, int factor) {
        if(base % factor == 0){
            return true;
        }
        return false;
    }
}
