package src;

public class BeginnerLostWithoutAMap {
    public static int[] map(int[] arr) {
        int multiplier = 2;;

        for(int i = 0; i < arr.length; i++){
            arr[i] = multiplier * arr[i];
        }
        return arr;
    }
}
