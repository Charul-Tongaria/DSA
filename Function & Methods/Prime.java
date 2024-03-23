// import java.util.*;

// public class Prime {

//     public static boolean isPrime(int n){
//         if(n==2){//corner case
//             return true;
//         }
//         for(int i=2; i<=n-1; i++){
//             if(n%i == 0){
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String args[]){
//         System.out.println(isPrime(17));
//     }
    
// }

import java.util.*;

public class Prime {

    public static boolean isPrime(int n){
        if(n==2){//corner case
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        System.out.println(isPrime(21));
    }
    
}

