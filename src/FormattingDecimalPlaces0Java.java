package src;

public class FormattingDecimalPlaces0Java {
    public static double TwoDecimalPlaces(double number)
    {
        return Math.round(number * 100.0) / 100.0;
    }
}
