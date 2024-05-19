import java.util.*;

public class Permutation {

    public static void fidPer(String str, String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        //recursion
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);
            fidPer(newstr, ans+curr);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        fidPer(str, "");
    }
}
