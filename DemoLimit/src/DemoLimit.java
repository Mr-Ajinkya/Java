/**
 * Created by Ajinkya Virkud on 2/12/2017.
 */
public class DemoLimit {

    public static void main(String[] args) {

        //create a double type variable and assign value 20
        //create a double type variable and assign value 80
        //add that value and  multiply by 25
        //And find the reminder of result
        // and check reminder is 20 or less than 20

        double firstvalue = 20d;
        double secondValue = 80d;
        double result = (firstvalue + secondValue) * 25;
        System.out.println("result = " + result);
        double reminder = result % 40;
        if(reminder <= 20)
            System.out.println("Total was over the limit");
    }
}
