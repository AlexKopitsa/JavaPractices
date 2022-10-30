package org.Java_labs.lab5;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task2_7 {
    public static void main(String[] args) {
        Float[][] matrix = {{10.0f,15.0f,12.0f},{22.0f,33.0f,44.0f},{55.0f,66.0f,17.0f}};
        System.out.print("Matrix: \n");
        showMatrix(matrix);
        for (int i = 1; i < 4; i++){
            System.out.printf("Result matrix: \n", (4-i)*90);
            showMatrix(rotateMatrix(matrix, i));
        }
    }
    public static void showMatrix(Float[][] matrix){
        for (Float[] floats : matrix) {
            System.out.println(Arrays.toString(floats));
        }
    }
    public static Float[][] rotateMatrix(Float[][] M, int k){
        Float[][] MR = new Float[M.length][M.length];
        if (k == 0)
            return M;
        else {
            int n = M.length;
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++)
                    MR[j][n-i-1] = M[i][j];
            }
        }
        return rotateMatrix(MR, k-1);
    }
}