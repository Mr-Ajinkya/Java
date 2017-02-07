import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ajinkya on 2/7/2017.
 */
public class Accept {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a character:");
        char ch = (char)br.read();
        System.out.println("You entered:" + ch);
    }
}
