package src;

public class QuarterOfTheYear {
    public static int quarterOf(int month) {
        switch(month){

            case 1:
                return 1;
            case 2:
                return 1;
            case 3:
                return 1;

            case 4:
                return 2;
            case 5:
                return 2;
            case 6:
                return 2;

            case 7:
                return 3;
            case 8:
                return 3;
            case 9:
                return 3;
        }

        return 4;
    }
}
