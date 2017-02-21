/**
 * Created by Ajinkya Virkud on 2/21/2017.
 */
public class MethodOverloading {
    public static void main(String[] args) {
       int newScore = calculateScore("Ajinkya" , 500);
        System.out.println("New Score is " + newScore);
        calculateScore(500);
        calculateScore();

    }
    public static int calculateScore(String player , int score){
        System.out.println("Player " + player + " Scored " + score + " Points");
        return score * 1000;
    }
    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points" );
        return score * 1000;
    }
    public static int calculateScore(){
        System.out.println("Unnamed player score" );
        return 0;
    }
}
