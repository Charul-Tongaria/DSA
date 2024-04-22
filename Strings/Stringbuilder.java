import java.util.*;

public class Stringbuilder {
    

    public static void main(String args[]){
        StringBuilder sc = new StringBuilder("");
        sc.toString();
        for(char ch='a'; ch<='z'; ch++ ){
            sc.append(ch);
        }
        System.out.println(sc);
        System.out.println(sc.length());
    }
}
