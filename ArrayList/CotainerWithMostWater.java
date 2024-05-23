import java.lang.reflect.Array;
import java.util.*;

public class CotainerWithMostWater {
    // public static int storeWater(ArrayList<Integer> height){
    //     int maxWater = 0;
    //     //brute force
    //     for(int i=0; i<height.size(); i++){//for 1st boundary
    //         for(int j=i+1; j<height.size(); j++){//for 2nd boundary
    //             int ht = Math.min(height.get(i), height.get(j));
    //             int width = j-i;
    //             int currwater = ht * width;
    //             maxWater = Math.max(maxWater,currwater);
    //         }
    //     }
    //     return maxWater;
    // }

    //two poiter approach
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while(lp<rp){
            //area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            //update ptr
            if(height.get(lp) < height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWater(height));
    }
}
