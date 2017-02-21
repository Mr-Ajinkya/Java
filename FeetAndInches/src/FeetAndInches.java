/**
 * Created by Ajinkya Virkud on 2/21/2017.
 */
public class FeetAndInches {

    public static void main(String[] args) {

        double centimeter  =  calcFeetAndInchesToCentimeter(14, 13);
        if (centimeter < 0.0){
            System.out.println("invalid parameter");
        }

    }

    public static double calcFeetAndInchesToCentimeter(double feet, double inches) {

        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or Inches");
            return -1;
        }

        double centimeter = (feet * 12) * 2.54;
        centimeter += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centimeter + " cm");
        return centimeter;

    }
}
