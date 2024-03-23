import java.util.*;

public class Sum {

    public static int Add(int num1, int num2){
        int sum=num1+num2;
        return sum;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number-");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number-");
        int b=sc.nextInt();
        int addition=Add(a,b);
        System.out.println("The sum is: "+ addition);
    }
    
}
