/**
 * Created by Ajinkya Virkud on 3/9/2017.
 */
public class SwitchExample {

    public static void main(String[] args) {

        char charValue = 'G';

        switch (charValue){

            case 'A':
                System.out.println("A was found");
                break;

            case 'B':
                System.out.println("B was found");
                break;

            case 'C':case 'D':case 'E':
                System.out.println("A,B,C,D or E found");
                break;

            default:
                System.out.println("Was not found");
                break;

        }

        String month = "july";
        switch (month.toLowerCase())
        {
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("June");
                break;
            default:
                System.out.println("Not sure");
                break;

        }

    }

}
