import java.util.*;

public class DiagonalSum {
   
    public static int digSum(int matrix[][]){
        int psum=0;
        int ssum=0;
        int sum;
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         //Primary Diagonal
        //         if(i==j){
        //             psum+=matrix[i][j];
        //         }
        //         if((i+j)==(matrix.length-1)){
        //             ssum+=matrix[i][j];
        //         }
        //     }
        // }
        // sum=psum+ssum;

        for(int i=0; i<matrix.length; i++){
            psum+=matrix[i][i];
            if(i != (matrix.length-1-i)){
                ssum+=matrix[i][matrix.length-1-i];
            }
        }
        sum=psum+ssum;
        return sum;
    }

    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        System.out.println(digSum(matrix));
    }

}
