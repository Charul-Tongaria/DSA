import java.util.*;

public class MultiDimensionalal {
    public static void main(String args[]){
    //     ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
    //     ArrayList<Integer> list = new ArrayList<>();
    //     list.add(1);
    //     list.add(2);
    //     mainlist.add(list);

    //     ArrayList<Integer> list1 = new ArrayList<>();
    //     list.add(3);
    //     list.add(4);
    //     mainlist.add(list1);

    //     for(int i=0; i<mainlist.size(); i++){
    //         ArrayList<Integer> currlist = mainlist.get(i);//lists of main list
    //         for(int j=0; j<currlist.size(); j++){
    //             System.out.print(currlist.get(j)+" ");
    //         }
    //         System.out.println();
    //     }
    //     System.out.println(mainlist);
    // }


        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=0; i<=5; i++){
            list1.add(i);
            list2.add(i*2);
            list3.add(i*3);
        }

        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);

        for(int i=0; i<mainlist.size(); i++){
            ArrayList<Integer> currlist = mainlist.get(i);
            for(int j=0; j<currlist.size(); j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }

//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         mainlist.add(list);

//         ArrayList<Integer> list1 = new ArrayList<>();
//         list.add(2);
//         list.add(4);
//         list.add(6);
//         list.add(8);
//         list.add(10);
//         mainlist.add(list1);

//         ArrayList<Integer> list2 = new ArrayList<>();
//         list.add(3);
//         list.add(6);
//         list.add(9);
//         list.add(12);
//         list.add(15);
//         mainlist.add(list2);
// }

    }
}