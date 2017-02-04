/**
 * Created by lenovo on 2/4/2017.
 */
public class DemoSwitch {
    public static void main(String[] args) {

        char color = 'g';


        switch (color){

            case 'r':
                System.out.println("Red");
                break;
            case 'g':
                System.out.println("Green");
                break;
            case 'o':
                System.out.println("Orange");
                break;
            case 'y':
                System.out.println("yellow");
                default:
                    System.out.println("Wrong selection");
        }
    }
}

