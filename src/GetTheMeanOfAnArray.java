package src;

public class GetTheMeanOfAnArray {
    public static int getAverage(int[] marks){
        int mean = 1;
        int sum = 0;
        int total = 0;

        for(int i = 0; i < marks.length; i++){
            sum += marks[i];
            total++;
        }
        mean = sum / total;

        return mean;
    }
}
