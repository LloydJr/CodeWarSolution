package src;

public class GrasshopperArrayMean {
    public static int findAverage(int[] nums) {
        int sum = 0;
        int mean = 0;
        int total = 0;

        for(int i = 0; i < nums.length; i++){
            total++;
            sum += nums[i];
            mean = sum / total;
        }
        return mean;
    }
}
