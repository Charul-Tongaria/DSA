import java.util.*;

public class HybridInheritance {
    public static void main(String args[]){
        Dolphin d = new Dolphin();
        d.swim();
        d.eat();
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

class Dolphin extends Fish{
    void feature(){
        System.out.println("Most Intelligent");
    }
}
