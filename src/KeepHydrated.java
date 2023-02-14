package src;

public class KeepHydrated {
    public int Liters(double time)  {

        double water = 0.5;

        double total = water * time;

        return (int)Math.floor(total);

    }
}
