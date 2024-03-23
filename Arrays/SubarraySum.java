import java.util.*;

public class SubarraySum {
    
    public static void Operate(int arr[]){
        
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            int start=i;
            for(int j=i; j<arr.length; j++){
                int end=j;
                currSum=0;
                for(int k=start; k<=end; k++){
                    // System.out.print(arr[k]+" ");
                    currSum = currSum + arr[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Maximum sum is "+maxSum);
    }

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        Operate(arr);
    }
    
}
