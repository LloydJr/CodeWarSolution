package src;

public class IfYouCantSleepJustCountSheep {
    public static String countingSheep(int num) {
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= num; i++){
            sb.append(i + " sheep...");
        }

        return sb.toString();
    }
}
