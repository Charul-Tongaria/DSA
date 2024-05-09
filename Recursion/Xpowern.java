import java.util.*;

// public class Xpowern {

//     public static int power(int x, int n){
//         if(n == 0){
//             return 1;
//         }
//         // int xnm1 = power(x, n-1);
//         // int xn = x* xnm1;
//         // return xn;
//         return x * power(x, n-1);
//     }

//     public static void main(String args[]){
//         System.out.println(power(2, 10));
//     }
    
// }


public class Xpowern{
    public static int power(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfpow = power(a, n/2);
        int halfpowSq = halfpow * halfpow ;

        //n is odd
        if(n%2 != 0){
            halfpowSq = a * halfpowSq;
        }
        return halfpowSq;
    }
    public static void main(String args[]){
        System.out.println(power(2, 10));
    }
}