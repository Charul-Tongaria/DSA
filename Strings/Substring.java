import java.util.*;

public class Substring {

    public static String Check(String str, int si, int ei){
        String substr="";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String args[]){
        String str="Hello World";
        System.out.println(str.substring(0,5));
        //System.out.println(Check(str, 2, 5));
    }

}
