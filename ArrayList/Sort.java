import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        //aesc
        Collections.sort(list);
        System.out.println(list);

        //desc comparator
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
    
}
