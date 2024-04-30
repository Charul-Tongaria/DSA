import java.util.*;

public class Ithbit {

    public static void main(String args[]){
        int num=5;
        if((num & (1 << 2)) == 0){
            System.out.println(0);
        }
        else{
            System.out.println(1);
        }
    }
    
}
