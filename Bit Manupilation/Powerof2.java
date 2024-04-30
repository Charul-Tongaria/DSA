import java.util.*;

public class Powerof2 {

    public static int check(int num){
        int bitmask = num & (num - 1);
        if(bitmask == 0){
            System.out.println("Power of 2");
            return bitmask;
        }
        else{
            System.out.println("Not the power of 2");
            return bitmask;
        }
    }

    public static void main(String args[]){
        check(32);
    }
    
}
