/**
 * Created by Ajinkya Virkud on 3/9/2017.
 */
public class CalculateIntrest {
    public static void main(String[] args) {

        for(int i=2; i<=8; i++){
            System.out.println("10000 at " + i + " % intrest " + String.format("%.2f", calculateIntrest(10000 , i)));
        }

        for(int i=8; i>=2; i--){
            System.out.println("\n 10000 at " + i + " % intrest " + String.format("%.2f", calculateIntrest(10000 , i)));
        }

    }
    public static double calculateIntrest (double amount, double intrestRate){
        return (amount * (intrestRate / 100));
    }
}
