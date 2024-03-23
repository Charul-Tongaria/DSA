// import java.util.*;

// public class Reverse{

//     public static void main(String args[]){

//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         while(num>0){
//             int last=num%10;
//             System.out.println(last);
//             num=num/10;
//         }
//         System.out.println();
//     }
// }

import java.util.*;

public class Reverse{

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        while(num>0){
            int last=num%10;
            rev=(rev*10)+last;
            num=num/10;
        }
        System.out.println(rev);
    }
}