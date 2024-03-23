import java.util.*;

public class SelectionSort {

    public static void sortAsc(int arr[]){

        int min=Integer.MIN_VALUE;
        for(int turns=0; turns<arr.length; turns++){
            int minPos=turns;
            for(int j=turns+1; j<arr.length-1; j++){
                if(arr[minPos] > arr[j]){
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[turns];
            arr[turns]=temp;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void sortDesc(int arr[]){

        int min=Integer.MIN_VALUE;
        for(int turns=0; turns<arr.length; turns++){
            int minPos=turns;
            for(int j=turns+1; j<arr.length-1; j++){
                if(arr[minPos] < arr[j]){
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[turns];
            arr[turns]=temp;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(+arr[i]+" ");
        }
    }

    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        sortAsc(arr);
        System.out.println();
        sortDesc(arr);
    }
    
}
