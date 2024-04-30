import java.util.*;

public class Clearrange {

    public static int func(int num, int i, int j){
        int a = (~0) << j+1;
        int b = (1<<i) -1;
        int bitmask = a|b;
        return num & bitmask;
    }

    public static void main(String args[]){
        System.out.println(func(2515, 2, 7));
    }
    
}
