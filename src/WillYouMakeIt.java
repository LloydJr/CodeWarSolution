package src;

public class WillYouMakeIt {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        boolean madeIt = true;
        boolean didNotMakeIt = false;


        if((mpg * fuelLeft) >= distanceToPump){
            return madeIt;
        }

        return didNotMakeIt;
    }
}
