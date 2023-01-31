package src;

public class ArrayPlusArray {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        // arr1 + arr2 is not working...
        int sum1 = 0;
        int sum2 = 0;
        int solution = 0;

        for(int i = 0; i < arr1.length; i++){
            sum1 += arr1[i];
        }
        for(int j = 0; j < arr2.length; j++){
            sum2+= arr2[j];
        }

        solution = sum1 + sum2;
        return solution;
    }
}
