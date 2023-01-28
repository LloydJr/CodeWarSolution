package src;

public class MultiplicationTableForNumber {
    public static String multiTable(int num) {
        StringBuilder sb = new StringBuilder();
        int solution = 0;

        for(int i = 1; i <= 10; i++){
            solution = i * num;
            sb.append(i + " * " + num + " = " + solution + "\n");
        }

        return sb.toString().trim();
    }
}
