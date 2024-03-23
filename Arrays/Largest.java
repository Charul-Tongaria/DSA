import java.util.*;

public class Largest {
    public static int Check(int number[]){
        //int large=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        // for(int i=0; i<number.length; i++){
        //     if(large<number[i]){
        //         large=number[i];
        //     }
        // }
        // return large;
        for(int i=0; i<number.length; i++){
            if(small>number[i]){
                small=number[i];
            }
        }
        return small;
    }
    public static void main(String args[]){
        int number[]={1,2,3,4,5};
        System.out.println(Check(number));
    }
}