/**
 * Created by lenovo on 2/4/2017.
 */
 class Binary {
    public static void main(String[] args){

        int num = 0b1010;

        System.out.printf("\nIn decimal = %d",num);
        System.out.printf("\nIn Octal = %o",num);
        System.out.printf("\nIn Hexadecimal = %x",num);
        System.out.printf("\nIn Binary = %s",Integer.toBinaryString(
                num
        ));
    }
}
