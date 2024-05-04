//using interface

import java.util.*;

public class MultipleInheritance {
    public static void main(String args[]){
        Bear b = new Bear();
        b.eatflesh();
        b.eatplants();
    }
}

interface Herbivore{
    void eatplants();
}

interface Carnivore{
    void eatflesh();
}

class Bear implements Herbivore, Carnivore{
    public void eatplants(){
        System.out.println("Eat Plants");
    }
    public void eatflesh(){
        System.out.println("Eat Flesh");
    }

}