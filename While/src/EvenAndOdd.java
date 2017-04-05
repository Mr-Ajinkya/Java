/**
 * Created by Ajinkya Virkud on 4/5/2017.
 */
public class EvenAndOdd {
    public static void main(String[] args) {
        int number = 5;
        int finishNumber = 20;
        while (number <= finishNumber){
            if (!isEvenNumber(number)){
                number++;
                continue;
            }
            System.out.println("Even number " + number);
            number++;
        }
    }
        public static boolean isEvenNumber(int number){
            if ((number % 2) == 0){
                return true;
            }else {
                return false;
            }

        }

    }

