import java.util.*;

public class Search {

    public static int Check(int number[], int key){
        for(int i=0; i<number.length; i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void  main(String args[]){
        int number[]={1,2,3,4,5};
        int key=74;
        System.out.println(Check(number, key));
    }
}
