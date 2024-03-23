import java.util.*;

public class DecimaltoBinary {

    public static void Convert(int num){
        int pow = 0;
        int binary = 0;
        while(num>0){
            int rem = num % 2;
            binary=binary + (rem*(int)Math.pow(10,pow));
            pow++;
            num=num/2;
        }
        System.out.println(binary);
    }
    public static void main(String args[]){
        Convert(13);
    }
    
}
