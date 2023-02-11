package src;

public class CalculateAverage {
    public static double find_average(int[] array){
        double count = 0;
        double sum = 0;

        for(int i = 0; i <= array.length - 1; i++){
            count++;
            sum += array[i];
        }
        return sum / count;
    }
}
