package src;

public class VowelCount {
    public static int getCount(String str) {
        int count = 0;

        char[] charArray = str.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            if (charArray[i] == ('a') ||
                    charArray[i] == ('e') ||
                    charArray[i] == ('i') ||
                    charArray[i] == ('o') ||
                    charArray[i] == ('u')){
                count++;
            }
        }
        return count;
    }
}
