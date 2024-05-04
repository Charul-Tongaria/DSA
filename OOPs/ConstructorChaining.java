import java.util.*;

public class ConstructorChaining {
    public static void main(String args[]){
        B b = new B();
    }
}

class A{
    public A(){
        System.out.println("A");
    }
}

class B extends A{
    public B(){
        this(1);//represent constructor of same class
        System.out.println("B");
    }
    public B(int k){
        System.out.println("B1");
    }
}
