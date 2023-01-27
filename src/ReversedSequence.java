package src;

public class ReversedSequence {
    public static int[] reverse(int n){
        int[] array = new int[n];;
        for(int i = 0; i < array.length; i++){
            array[i] = n;
            n -= 1;
        }
        return array;
    }
}
