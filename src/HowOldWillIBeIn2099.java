package src;

public class HowOldWillIBeIn2099 {
    public static String CalculateAge(int birth, int yearTo) {
        int age = yearTo - birth;

        if (age < (-1)){
            return "You will be born in " + String.valueOf(age * (-1)) + " years.";
        }
        else if(age == 0){
            return "You were born this very year!";
        }
        else if(age == 1){
            return "You are 1 year old.";
        }
        else if(age == (-1)){
            return "You will be born in 1 year.";
        }
        return "You are " + String.valueOf(age) + " years old.";
    }
}
