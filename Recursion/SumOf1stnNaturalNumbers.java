import java.util.*;

public class SumOf1stnNaturalNumbers {
    public static int Sum(int n){
        if(n == 1){
            return 1;
        }
        int fn = n + Sum(n-1);
        return fn;
    }
    public static void main(String args[]){
        System.out.println(Sum(5));
    }
}
