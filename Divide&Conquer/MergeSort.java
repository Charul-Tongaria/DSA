import java.util.*;

public class MergeSort{

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void sort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2;
        sort(arr, si, mid);//left
        sort(arr, mid+1, ei);//right

        merge(arr, si, ei, mid);

    }

    public static void merge(int arr[], int si, int ei, int mid){
        int temp[] = new int[ei - si +1 ];
        int i = si; //iterator for left part
        int j = mid + 1; //iterator for right part
        int k = 0; //iterator for temp arr

        while(i <= mid && j <= ei){//pick from left 
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{//pick from right
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid){//remaining elements of left part 
            temp[k++] = arr[i++];
        }
        while(j <= ei){//remaining elements of right part 
            temp[k++] = arr[j++];
        }

        for(k=0, i=si; k<temp.length; k++, i++){//copy to original array
            arr[i] = temp[k];
        }

    }

    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8};
        sort(arr, 0, arr.length-1);
        printArr(arr);
    }
}