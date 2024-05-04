import java.util.*;

public class Super {
    public static void main(String args[]){
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor");
    }
}

class Horse extends Animal{
    Horse(){
        super.color = "brown";
        System.out.println("Horse constructor");
    }
}