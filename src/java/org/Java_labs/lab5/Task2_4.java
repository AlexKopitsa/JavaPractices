package org.Java_labs.lab5;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task2_4 {
    public static void main(String[] args) {
        int n = 3;
        Float[][] matrix = {{10.0f,-15.0f,12.0f},{22.0f,-33.0f,44.0f},{55.0f,-66.0f,17.0f}};
        showMatrix(matrix);
        for (int i = 0; i < matrix.length; i++){
            System.out.printf("Result: %f", findSum(matrix, i));
        }
    }
    public static void showMatrix(Float[][] matrix){
        for (Float[] floats : matrix) {
            System.out.println(Arrays.toString(floats));
        }
    }
    public static Float findSum(Float[][] M, int k){
        Float sum = 0.0f;
        for (int i = 0; i < M.length; i++){
            if (M[k][i] >= 0){
                for (int j = i+1; j < M.length; j++){
                    if (M[k][j] >= 0)
                        return sum;
                    sum += M[k][j];
                }
            }
        }
        return sum;
    } 
}