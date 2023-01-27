package src;

public class DifferenceOfVolumesOfCuboids {
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        int firstTotal = 1;
        int secondTotal = 1;
        int difference = 0;

        for(int i = 0; i < firstCuboid.length; i++){
            firstTotal *= firstCuboid[i];
        }
        for(int j = 0; j < secondCuboid.length; j++){
            secondTotal *= secondCuboid[j];
        }

        difference = firstTotal - secondTotal;

        if(difference < 0){
            return difference * (-1);
        }

        return difference;
    }
}
