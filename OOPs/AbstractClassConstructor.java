import java.util.*;

public class AbstractClassConstructor{

    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();
        Chicken c = new Chicken();
        c.eat();
        c.walk();
        Mustang m = new Mustang();
    }
    
}


abstract class Animal{
    String color;

    //constructor
    Animal(){
        System.out.println("Animal constructor called");
    }
    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }

    void ChangeColor(){
        color = "Dark Brown";
    }

    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal{
    void ChangeColor(){
        color = "Yellow";
    }

    void walk(){
        System.out.println("walks on 2 legs");
    }
}
