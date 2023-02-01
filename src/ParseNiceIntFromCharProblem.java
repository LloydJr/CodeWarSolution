package src;

public class ParseNiceIntFromCharProblem {
    public static int howOld(final String herOld) {
        int age = Character.getNumericValue(herOld.charAt(0));
        return age;
    }
}
