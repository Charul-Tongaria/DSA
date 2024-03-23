import java.util.*;

public class InnvertedandRotatedHalfPyramid {

    public static void main(String args[]){
        int row=4;
        //int column=4;
        for(int i=1; i<=row; i++){
            for(int j=1; j<=row-1; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
