import java.util.*;
public class TypePromotion{
    public static void main(String args[]){
        // int a=10;
        // float b=20.25f;
        // long c=25;
        // double d=30;
        // int ans=(int)(a+b+c+d);
        // System.out.println(ans);

        byte b=5;
        byte a=(byte)(b*2);
        System.out.println(a);

        // short a=5;
        // byte b=25;
        // char c='c';
        // byte bt=(byte)(a+b+c);
        // System.out.println(bt);

        // char a='a';
        // char b='b';
        // System.out.println((int)a);
        // System.out.println((int)b);
        // System.out.println(b-a);
    }
}