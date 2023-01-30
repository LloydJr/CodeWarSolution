package src;

public class SurfaceAreaAndVolumeOfABox {
    public static int[] getSize(int w,int h,int d) {
        int volume = w * h * d;
        int surfaceArea = (2 * (w * h)) + (2 * (w * d)) + (2 * (h * d));

        int[] arr = {surfaceArea, volume};

        return arr;
    }
}
