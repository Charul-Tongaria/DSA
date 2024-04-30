import java.util.*;

public class Clearlast {

    public static void main(String args[]){
        int num= 15;
        int i=2;
        int bitmask = (~0 << i);
        System.out.println(num & bitmask);
    }
    
}
