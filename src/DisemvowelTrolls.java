package src;

public class DisemvowelTrolls {
    public static String disemvowel(String str) {
        return str.replaceAll("(?i)[aeiou]" , "");
    }
}
