import java.util.*; 

public class Clearbit {

    public static int func(int num, int i){
        int bitmask= ~(1<<i);
        return num & bitmask;
    }

    public static void main(String args[]){
        System.out.println(func(5,2));
    }
    
}
