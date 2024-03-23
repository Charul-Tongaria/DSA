import java.util.*;

public class Pairs {

    public static void PrintPairs(int arr[]){
        for(int i=0; i<arr.length; i++){
            int curr=arr[i];
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + curr + "," + arr[j] +")");
            }
            System.out.println();
        }
        int total = ((arr.length)*(arr.length-1))/2;
        System.out.println("Total pairs = "+total);
    }

    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        PrintPairs(arr);
    }
    
}
