/**
 * Created by Ajinkya Virkud on 2/12/2017.
 */
public class Method {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 1000;
        int levelCompleted = 5;
        int bonus = 100;

        CalculteScore(gameOver , score , levelCompleted, bonus);

    }

    private static void CalculteScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver){
            int finalScore = score + ( levelCompleted * bonus);
            System.out.println("Ypur score was " + finalScore);
        }
    }
}
