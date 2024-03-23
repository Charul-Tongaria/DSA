// import java.util.*;

// public class Prime {

//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         if(num==2){
//             System.out.println("Prime");
//         }
//         else{
//             for(int i=2; i<=num-1; i++){
//                 if(num%i==0){
//                     System.out.println("Not Prime");
//                 }
//             }
//             System.out.println("Prime");
//         }
//     }
    
// }

import java.util.*;

public class Prime {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num==2){
            System.out.println("Prime");
        }
        else{
            for(int i=2; i<=Math.sqrt(num); i++){
                if(num%i==0){
                    System.out.println("Not Prime");
                }
            }
            System.out.println("Prime");
        }
    }
    
}
