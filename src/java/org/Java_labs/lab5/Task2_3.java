package org.Java_labs.lab5;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task2_3 {
    public static void main(String[] args) {
        int n = 3;
        Float[][] matrix = {{10.0f,15.0f,12.0f},{22.0f,33.0f,44.0f},{55.0f,66.0f,17.0f}};
        showMatrix(matrix);
        System.out.printf("Result: %f", findNum(matrix));
    }
    public static void showMatrix(Float[][] matrix){
        for (Float[] floats : matrix) {
            System.out.println(Arrays.toString(floats));
        }
    }
    public static float findNum(Float[][] M){
        float a = M[0][0], b, counter = (float) 0, max_counter = (float) 0;
        float n = (float) M.length;
        
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                b = M[i][j];
                if (a < b){
                    counter += 1;
                }
                else {
                    if (counter > max_counter)
                        max_k = counter;
                    counter = 1;
                }
                a = b;
            }
        }
        return max_counter;
    }
}