import java.util.*;

public class FirstOccurance {
    public static int fo(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return (fo(arr, key, i+1));
    }
    public static void main(String args[]){
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(fo(arr, 5, 0));
    }
}
