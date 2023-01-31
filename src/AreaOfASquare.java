package src;

public class AreaOfASquare {
    public static double squareArea(double A){
        double solution = Math.pow(2 * A / Math.PI, 2);
        return Math.round(solution * 100.0) / 100.0;
    }
}
