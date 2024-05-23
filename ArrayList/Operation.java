import java.util.*;

public class Operation{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        //add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        //get element
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        //delete
        list.remove(0);
        System.out.println(list);

        //set at index n
        list.set(0, 7);
        System.out.println(list);

        //cotains
        System.out.println(list.contains(1));
        System.out.println(list.contains(4));

        //on add
        list.add(0, 77);
        System.out.println(list);
    }
}