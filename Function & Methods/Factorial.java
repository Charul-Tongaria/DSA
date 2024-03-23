import java.util.*;

public class Factorial {

    public static int Facto(int num){
        int fact=1;
        for(int i=1; i<=num; i++){
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number-");
        int number=sc.nextInt();
        int factorial=Facto(number);
        System.out.println("The factorial is-" + factorial);

    }
    
}
