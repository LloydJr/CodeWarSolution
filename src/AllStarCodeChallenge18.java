package src;

public class AllStarCodeChallenge18 {
    public static int strCount(String str, char letter) {
        int count = 0;
        char[] c = str.toCharArray();
        for(int i = 0; i < c.length; i++){
            if(c[i] == letter){
                count++;
            }
        }
        return count;
    }
}
