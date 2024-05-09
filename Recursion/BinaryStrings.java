import java.util.*;

public class BinaryStrings {
    public static void printStrings(int n, int lastplace, String str){
        // if(lastplace == 0){
        //     printString(n-1, 0, str.append("0"));
        //     printString(n-1, 1, str.append("1"));
        // }
        // else{
        //     printString(n-1, 0, str.append("0"));
        // }
        if(n == 0){
            System.out.println(str);
            return;
        }
        printStrings(n-1, 0, str+"0");
        if( lastplace == 0){
            printStrings(n-1, 1, str+"1");
        }
    }

    public static void main(String args[]){
        printStrings(3, 0, " ");
    }
}
