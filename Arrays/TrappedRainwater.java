// import java.util.*;

// public class TrappedRainwater {

//     public static int trappedWater(int height[]){

//         // int n=height.length;
//         int leftMax[]=new int[height.length];
        
//         for(int i=0; i<height.length; i++){
//             if(i==0){
//                 leftMax[0]=height[0];
//             }
//             else{
//                 leftMax[i]=Math.max(height[i], leftMax[i-1]);
//             }
//         }

//         int rightMax[]=new int[height.length];
//         rightMax[height.length]=height[height.length];
//         for(int i=height.length-2; i>=0; i--){
//             rightMax[i]=Math.max(height[i], rightMax[i+1]);
//         }

//         int water=0;
//         for(int i=0; i<=height.length; i++){
//             int level=Math.min(leftMax[i], rightMax[i]);
//             water=water+(level-height[i]);
//         }
//         return water;
//     }

//     public static void main(String args[]){
//         int height[]={4,2,0,6,3,2,5};
//         System.out.println(trappedWater(height));
//     }
    
// }

import java.util.*;
class TUF {
    static int trap(int[] arr) {
        int n = arr.length;
        int waterTrapped = 0;
        for (int i = 0; i < n; i++) {
            int j = i;
            int leftMax = 0, rightMax = 0;
            while (j >= 0) {
                leftMax = Math.max(leftMax, arr[j]);
                j--;
            }
            j = i;
            while (j < n) {
                rightMax = Math.max(rightMax, arr[j]);
                j++;
            }
            waterTrapped += Math.min(leftMax, rightMax) - arr[i];
        }
        return waterTrapped;
    }
    public static void main(String args[]) {
        int arr[] = {4,2,0,6,3,2,5};
        System.out.println(trap(arr));
    }
}