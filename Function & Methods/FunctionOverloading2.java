// using datatypes
import java.util.*;

public class FunctionOverloading2 {
    
    public static int Sum(int a, int b){
        return a+b;
    }

    public static float Sum(float a, float b){
        return a+b;
    }

    public static void main(String args[]){
        System.out.println(Sum(2,3));
        System.out.println(Sum(2.5f,3.5f));
    }
}