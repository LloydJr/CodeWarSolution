package src;

import java.util.ArrayList;
import java.util.List;

public class ReverseWords {
    public static String reverseWords(final String original) {
        String[] arr = original.split(" ");
        if (arr.length == 0) {
            return original;
        }

        List<String> res = new ArrayList<String>();
        for (String w : arr) {
            StringBuilder r = new StringBuilder();
            r.append(w);
            r = r.reverse();
            res.add(r.toString());
        }

        return String.join(" ", res);
    }
}
