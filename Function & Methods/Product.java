import java.util.*;

public class Product {

    public static int Multiply(int num1, int num2){
        int pro=num1*num2;
        return pro;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number-");
        int a=sc.nextInt();
        System.out.print("Enter 2nd number-");
        int b=sc.nextInt();
        int product=Multiply(a,b);
        System.out.println("The product is: "+ product);
    }
    
}
