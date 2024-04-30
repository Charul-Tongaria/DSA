import java.util.*;

public class Update {

    public static int Set(int num, int i){
        int bitmask= 1<<i;
        return num | bitmask; 
    }

    public static int Clear(int num, int i){
        int bitmask= ~(1<<i);
        return num & bitmask;
    }

    public static void func(int num, int i, int newbit){
        if(newbit == 0){
            System.out.println(Clear(num, i));
        }
        else if(newbit == 1){
            System.out.println(Set(num, i));
        }
        else{
            System.out.println("Invalid");
        }
    }

    public static void  main(String args[]){
        func(5,2,0);
    }
    
}
