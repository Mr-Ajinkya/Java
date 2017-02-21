/**
 * Created by Ajinkya Virkud on 2/21/2017.
 */
public class PlayerScore {

    public static void main(String[] args) {
        int position = calculateHighScorePostion(1500);
        displayHighScorePosition("Ajinkya", position);
        position = calculateHighScorePostion(900);
        displayHighScorePosition("Rahul", position);
        position = calculateHighScorePostion(400);
        displayHighScorePosition("Yuvraj", position);
        position = calculateHighScorePostion(50);
        displayHighScorePosition("Sayali", position);

    }



        public static void displayHighScorePosition(String playername,int position){
            System.out.println(playername + " managed to get into position" + position + " on the high score table");
    }
    public static int calculateHighScorePostion(int playerScore){
            if(playerScore > 1000){
                return  1;
            }
            else if (playerScore > 500 && playerScore < 1000){
                return 2;
            }
            else if(playerScore > 100 && playerScore < 500){
                return 3;
        }
        else{
                return 4;
        }
    }
}
