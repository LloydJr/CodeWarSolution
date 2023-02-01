package src;

public class DetermineOffSpringSexBasedOnGenesXXandXYchromosomes {
    public static String chromosomeCheck(String sperm) {
        if(sperm.contains("XX")){
            return "Congratulations! You're going to have a daughter.";
        }
        return "Congratulations! You're going to have a son.";
    }
}
