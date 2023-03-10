package src;

import java.util.Arrays;

public class PythagoreanTriple {
    public int pythagoreanTriple(int[] triple){
        Arrays.sort(triple);

        int a = triple[0] * triple[0];
        int b = triple[1] * triple[1];
        int c = triple[2] * triple[2];

        if(c == a + b){
            return 1;
        }
        return 0;
    }
}
