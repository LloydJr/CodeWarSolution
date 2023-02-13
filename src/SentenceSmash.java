package src;

public class SentenceSmash {
    public static String smash(String... words) {
        String newStr = "";
        for(int i = 0; i < words.length; i++){
            newStr += words[i];

            if(i < words.length - 1){
                newStr += " ";
            }

        }
        return newStr;
    }
}
