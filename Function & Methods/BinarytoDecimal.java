import java.util.*;

public class BinarytoDecimal {

    public static void Convert(int num){
        int pow = 0;
        int decimal = 0;
        while(num>0){
            int rem = num % 10;
            decimal=decimal + (rem*(int)Math.pow(2,pow));
            pow++;
            num=num/10;
        }
        System.out.println(decimal);
    }
    public static void main(String args[]){
        Convert(1101);
    }
    
}
