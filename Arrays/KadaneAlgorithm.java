import java.util.*;

public class KadaneAlgorithm {

    public static void Algo(int arr[]){
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            int x=currSum + arr[i];
            if(x<=0){
                currSum=0;
            }
            else{
                currSum=currSum + arr[i];
            }
            System.out.println(currSum);

            if(currSum>=maxSum){
                maxSum = currSum;
            }
        }
        System.out.println("Maximum sum is "+maxSum);
    }

    public static void main(String args[]){
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        Algo(arr);
    }

}