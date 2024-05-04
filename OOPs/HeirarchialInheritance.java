import java.util.*;

public class HeirarchialInheritance {
    public static void main(String args[]){
        Fish f = new Fish();
        f.eat();
        Bird b = new Bird();
        b.eat();
        Mammals m = new Mammals();
        m.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Flies");
    }
}

class Mammals extends Animal{
    void walk(){
        System.out.println("Walks");
    }
}
