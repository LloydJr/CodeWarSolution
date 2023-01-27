package src;

public class PredictYourAge {
    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        int[] total = {age1, age2, age3, age4, age5, age6, age7, age8};
        int sum = 0;
        int temp = 1;
        double root = 1;

        for(int i = 0; i < total.length; i++){
            temp = total[i] * total[i];
            sum += temp;
        }

        root = Math.sqrt(sum);
        return (int)Math.floor(root) / 2;
    }
}
