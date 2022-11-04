package org.Java_labs.lab5;
import java.util.Arrays;

public class Task2_5 {
    public static void main(String[] args) {
        Float[][] matrix = {{10.0f,15.0f,12.0f},{22.0f,33.0f,44.0f},{55.0f,66.0f,17.0f}};
        showMatrix(matrix);
        System.out.print("Result: \n");
        showMatrix(transposeMatrix(matrix));
    }
    public static void showMatrix(Float[][] matrix){
        for (Float[] floats : matrix) {
            System.out.println(Arrays.toString(floats));
        }
    }
    public static Float[][] transposeMatrix(Float[][] M){
        int n = M.length;
        Float[][] MT = new Float[n][n];
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < n; j++)
                MT[j][i] = M[i][j];
        }
        return MT;
    }
}
