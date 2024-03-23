import java.util.*;
public class Tax{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int tax;
        int inc=sc.nextInt();
        if(inc<500000){
            tax=0;
        }
        else if(inc>=500000 && inc<1000000){
            tax=20;
        }
        else{
            tax=30;
        }
        System.out.println(tax);
    }
}