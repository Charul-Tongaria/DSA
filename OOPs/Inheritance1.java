import java.util.*;

public class Inheritance1 {

    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat(); 
    }
    
}

//Base class
class Animal{

    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }

}

//Derived Class //Sub class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims");
    }
}
