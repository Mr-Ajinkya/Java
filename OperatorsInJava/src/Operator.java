/**
 * Created by Ajinkya Virkud on 2/11/2017.
 */
public class Operator {
    public static void main(String[] args) {
        int result = 1 + 2;

        System.out.println("1 + 2 = " + result);

        int myResult = result;

        result = result - 1;
        System.out.println(myResult + " - 1 = " + result);

        myResult = result;
        result = result * 10;
        System.out.println(myResult + " * 10 = " + result);

        myResult = result;
        result = result / 2;
        System.out.println(myResult + " / 2 = " + result);

        myResult = result;
        result = result % 2;
        System.out.println(myResult + " % 2 = " + result);


    }
}
