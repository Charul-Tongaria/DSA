// public class Sum{
//     public static void main(String args[]){
//         int a=10;
//         int b=5;
//         int sum;
//         sum=a+b;
//         System.out.println("Sum is-"+sum)
//     }
// }

import java.util.*;
public class Sum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number-");
        int num1=sc.nextInt();
        System.out.println("Enter second number-");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("Sum is-"+sum);
    }
}