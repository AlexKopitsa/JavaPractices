package org.Java_labs.lab5;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task2_6 {
    public static void main(String[] args) {
        Float[][] matrix = {{10.0f,15.0f,12.0f},{22.0f,33.0f,44.0f},{55.0f,66.0f,17.0f}};
        showMatrix(matrix);
        findNorm(matrix);
    }
    public static void showMatrix(Float[][] matrix){
        for (Float[] floats : matrix) {
            System.out.println(Arrays.toString(floats));
        }
    }
    public static void findNorm(Float[][] M){
        float Knorm = 0.0f;
        float max_sumM =  0.0f, max_sumL =  0.0f;
        for (int i = 0; i < M.length; i++){
            int sumM = 0, sumL = 0;
            for (int j = 0; j < M.length; j++){
                sumM += Math.abs(M[i][j]);
                sumL += Math.abs(M[j][i]);
                Knorm += Math.pow(M[i][j], 2);
            }
            if (sumM > max_sumM)
                max_sumM = sumM;            
            if (sumL > max_sumL)
                max_sumL = sumL;
        }
        System.out.printf("M norm: %.3f \n", max_sumM);
        System.out.printf("L norm: %.3f \n", max_sumL);
        System.out.printf("K norm: %.3f \n", Math.sqrt(Knorm));
    }
}