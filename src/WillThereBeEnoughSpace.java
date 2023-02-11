package src;

public class WillThereBeEnoughSpace {
    public static int enough(int cap, int on, int wait){
        if(cap < (on + wait)){
            return wait = (on + wait) - cap;
        }
        return 0;
    }
}
