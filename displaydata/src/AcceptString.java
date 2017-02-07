import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Ajinkya on 2/7/2017.
 */
public class AcceptString {

    public static void main(String[] args)throws Exception {
        //Accept data from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a name:");//Enter string and read it
        String name = br.readLine();
        System.out.println("You entered" + name);//Display enter string
    }
}
