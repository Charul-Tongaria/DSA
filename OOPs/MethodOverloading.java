import java.util.*;

public class MethodOverloading {
    public static void main(String args[]){
        Calculator cal = new Calculator();
        System.out.println(cal.Sum(1,2));
        System.out.println(cal.Sum(1.0,2.0));
        System.out.println(cal.Sum(1,2,3));
    }
}

class Calculator{
    public static int Sum(int a, int b){
        return a+b;
    }
    public static double Sum(double a, double b){
        return a+b;
    }
    public static int Sum(int a, int b, int c){
        return a+b+c;
    }
}