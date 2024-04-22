import java.util.*;
import java.lang.Math;

public class ShortestPath {
    
    public static int Solve(String str){
        int y=0;
        int x=0;
        for(int i=0; i<str.length(); i++){
            char dir=str.charAt(i);
            if(dir == 'N'){
                y++;
            }
            if(dir == 'S'){
                y--;
            }
            if(dir == 'W'){
                x--;
            }
            if(dir == 'E'){
                x++;
            }
        }
        int X2=(x+0)*(x-0);
        int Y2=(y+0)*(y-0);
        return (int)Math.sqrt(X2+Y2);
    }

    public static void main(String args[]){
        String str="WNEENESENNN";
        System.out.println(Solve(str));
    }

}
