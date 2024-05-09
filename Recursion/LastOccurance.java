import java.util.*;

public class LastOccurance {
    public static int lo(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lo(arr, key, i+1);//checks for the last one firstly
        if(isFound == -1 && arr[i] == key ){
            return i;
        }
        return isFound;
    }
    public static void main(String args[]){
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(lo(arr, 5, 0));
    }
}
