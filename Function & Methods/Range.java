import java.util.*;

public class Range {

    public static boolean isPrime(int n){
        if(n==2){//corner case
            return true;
        }
        for(int i=2; i<=n-1; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void inRange(int num){
        for(int i=2; i<=num; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        inRange(number);
    }
    
}

    

