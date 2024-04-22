import java.util.*;

public class StringCompare {
    
    public static void main(String args[]){
        String s1="Charul Tongaria";
        String s2="Charul Tongaria";
        String s3=new String("Charul Tongaria");

        if(s1==s2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        if(s1==s3){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }

}
