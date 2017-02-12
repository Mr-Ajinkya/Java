/**
 * Created by Ajinkya Virkud on 2/12/2017.
 */
public class Main {
    public static void main(String[] args) {

        //Print final score by using
        //set score to 10000
        //set bonus to 200
        //set levelCompleted to 8

        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bounus = 200;

        if(gameOver){

            int finalScore = score + (bounus * levelCompleted);
            System.out.println("Your score was : " + finalScore);
        }

    }
}
