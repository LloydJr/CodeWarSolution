package src;
import java.util.Arrays;


public class WelcomeToTheCity {
    public String sayHello(String [] name, String city, String state){
        String newStr = "";
        for(int i = 0; i < name.length; i++){
            newStr += name[i] + " ";
        }
        newStr = newStr.trim();
        return "Hello, " + newStr + "! Welcome to " + city + ", " + state + "!";
    }
}
