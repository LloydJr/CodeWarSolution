package src;

import java.util.Arrays;

public class SortAndStar {
    public static String twoSort(String[] s) {
        Arrays.sort(s);
        char[] c = s[0].toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < c.length - 1; i++){
            sb.append(String.valueOf(c[i]));
            sb.append("***");
        }

        sb.append(c[c.length - 1]);
        return sb.toString();
    }
}
