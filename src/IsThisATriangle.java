package src;

public class IsThisATriangle {
    public static boolean isTriangle(int a, int b, int c){
        //1.a + b > c
        //2.a + c > b
        //3.b + c > a

        if((a + b) > c && (a + c) > b && (b + c) > a){
            return true;
        }
        return false;
    }
}
