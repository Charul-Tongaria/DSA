import java.util.*;

public class Tiling{
    public static int tile(int n){// 2*n floor size
        if(n == 0 || n== 1){
            return 1;
        }
        //vertical 
        int verticaltiles = tile(n-1);

        //horizontal
        int horizontaltiles = tile(n-2);

        int total = verticaltiles + horizontaltiles;
        return total;
    }
    public static void main(String args[]){
        System.out.println(tile(4));
    }
}