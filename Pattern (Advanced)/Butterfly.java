import java.util.*;
public class Butterfly {
    public static void main(String args[]){
        for(int i=1; i<=4; i++){
            //1st half
            // i stars 
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            // 2(n-i) sspaces
            for(int j=1; j<=2*(4-i); j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //2nd half
        for(int i=4; i>=1; i--){
            //1st half
            // i stars 
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            // 2(n-i) sspaces
            for(int j=1; j<=2*(4-i); j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}
