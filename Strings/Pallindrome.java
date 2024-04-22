import java.util.*;

public class Pallindrome {
    
    public static boolean isTrue(String str){
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str="racecar";
        System.out.println(isTrue(str));
        String str1="charul";
        System.out.println(isTrue(str1));
    }

}
