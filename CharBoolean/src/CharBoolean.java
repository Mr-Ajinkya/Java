/**
 * Created by Ajinkya Virkud on 2/11/2017.
 */
public class CharBoolean {
    public static void main(String[] args) {

        //Display a copyright and register symbol using unicode
        //width of char 16 (2byte)
        char myChar = '\u00A9';
        System.out.println("Unicode is : " + myChar);
        char myReg = '\u00AE';
        System.out.println("Unicode for regiter : " + myReg);
    }
}
