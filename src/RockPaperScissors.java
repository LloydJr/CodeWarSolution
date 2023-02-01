package src;

public class RockPaperScissors {
    public static String rps(String p1, String p2) {

    if(p1.contains("rock") && p2.contains("scissor")){
        return "Player 1 won!";
    }
    else if(p1.contains("scissor") && p2.contains("paper")){
        return "Player 1 won!";
    }
    else if(p1.contains("paper") && p2.contains("rock")){
        return "Player 1 won!";
    }
    else if(p1 == p2){
        return "Draw!";
    }
    else{
        return "Player 2 won!";
    }
}

}
