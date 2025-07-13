package Practice.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZero {
    public void setZeroes(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        boolean FirstRowisZero = false;
        boolean FirstColisZero = false;

        //First Row and Column check if they contain Zero or not
        for(int i = 0; i < m; i++){
            if(matrix[i][0] == 0) FirstColisZero = true;
        }
        for(int j = 0; j < n; j++){
            if(matrix[0][j] == 0) FirstRowisZero = true;
        }

        //Filling First Row and Col with the Checking of Zero Contains in the entire matrix
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        //Now Rescan First row and col to make the row and col to Zero
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        //Now after filling everything, Takin care of the First Row and Column
        if(FirstColisZero){
            for(int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }
        if(FirstRowisZero){
            for(int j = 0; j < n; j++){
                matrix[0][j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        SetMatrixZero obj = new SetMatrixZero();
        //[[0,1,2,0],[3,4,5,2],[1,3,1,5]]
        int[][] input = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        obj.setZeroes(input);
        System.out.println(Arrays.deepToString(input));
    }
}
