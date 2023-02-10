package src;

public class SquareNSum {
    public static int squareSum(int[] n){
        int sum = 0;

        for(int i = 0; i <= n.length - 1; i++){
            sum += n[i] * n[i];
        }
        return sum;
    }
}
