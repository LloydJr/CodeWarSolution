package src;

public class SumOfNumbersFrom0ToN {
    public static String showSequence(int value){
        StringBuilder sb = new StringBuilder();
        int sum = 0;

        for(int i = 0; i <= value; i++){
            sb.append(i + "+");
            sum += value;
        }
        if(value == 0){
            return "0=0";
        }
        else if(value <= (-1)){
            return String.valueOf(value) + "<0";
        }

        return sb.toString().substring(0, sb.length() - 1) + String.valueOf(" = " + sum / 2);
    }
}
