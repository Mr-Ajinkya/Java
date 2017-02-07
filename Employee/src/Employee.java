import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ajinkya on 2/7/2017.
 */
public class Employee {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Employee id::");
        int id = Integer.parseInt(br.readLine());

        System.out.println("Enter Employee sex(M/F)::");
        char sex = (char)br.read();
        br.skip(1);

        System.out.println("Enter name::");
        String name = br.readLine();

        System.out.println("Id::" + id);
        System.out.println("Sex::" + sex);
        System.out.println("Name::" + name);

    }
}
