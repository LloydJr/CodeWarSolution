package src;

public class ExclamationMarksSeries11ReplaceAllVowelToExclamationMarkInTheSentence {
    public static String replace(final String s) {
        return s.replaceAll( "[aeiouAEIOU]", "!" );

    }
}
