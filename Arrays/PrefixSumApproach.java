import java.util.*;

public class PrefixSumApproach {

    public static void Operate(int arr[]){
        
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];

        prefix[0]=arr[0];

        for(int i=1; i<prefix.length; i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0; i<arr.length; i++){
            int start=i;
            for(int j=i; j<arr.length; j++){
                int end=j;
                
                if(start==0){
                    currSum=prefix[end];
                }
                else{
                    currSum=prefix[end]-prefix[start-1];
                }

                

                // for(int k=start; k<=end; k++){
                //     // System.out.print(arr[k]+" ");
                //     currSum = currSum + arr[k];
                // }
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
