package src;

public class FindTheOddInt {
    public static int findIt(int[] a) {

        for(int i = 0; i < a.length; i++){

            int occurences = 0;
            int num = a[i];

            for(int j = 0; j < a.length; j++){

                if(a[j] == num){

                    occurences++;
                }
            }
            if(occurences % 2 != 0){

                return num;
            }
        }
        return 0;
    }
}
