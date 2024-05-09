import java.util.*;

public class FriendsPairing {
    public static int pair(int n){
        if(n==1 || n==2){
            return n;
        }
        // //choice single
        // int fnm1 = pair(n-1);
        
        // //choice pair
        // int fnm2 = pair(n-2);
        // int pairways = (n-1) * fnm2;

        // int total = fnm1 + pairways;
        // return total;
        return pair(n-1) + (n-1) * pair(n-2);
    }

    public static void main(String args[]){
        System.out.println(pair(3));
    }
}
