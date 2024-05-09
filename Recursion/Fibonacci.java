import java.util.*;

public class Fibonacci {
    public static int Fib(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int fibnm1 = Fib(n-1);
        int fibnm2 = Fib(n-2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }
    public static void main(String args[]){
        System.out.println(Fib(25));
    }
}
