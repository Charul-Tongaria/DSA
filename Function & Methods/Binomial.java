import java.util.*;

public class Binomial {

    public static int Fact(int num){
        int f=1;
        for(int i=1; i<=num; i++){
            f=f*i;
        }
        return f;
    }

    public static int Bino(int n, int r){
        int num1=Fact(n);
        int num2=Fact(r);
        int num3=Fact(n-r);

        int res=num1 / (num2 * num3);
        return res;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n-");
        int n=sc.nextInt();
        System.out.print("Enter r-");
        int r=sc.nextInt();
        int result=Bino(n,r);
        System.out.print("Binomial coefficient is -" + result);

    }
    
}
