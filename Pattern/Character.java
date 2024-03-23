import java.util.*;

public class Character {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows-");
        int row=sc.nextInt();
        char ch='A';
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
}
