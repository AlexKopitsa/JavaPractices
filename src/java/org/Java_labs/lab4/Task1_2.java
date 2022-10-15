package org.Java_labs.lab4;
import java.util.Scanner;

public class Task1_2 {
    public static int max(Integer [] array) {
        int max = 0;

        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
    public static int min(Integer[] array) {
        int min = array[0];

        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        String[] listOfNumsStr = nums.split(" ");
        Integer[] listOfNumsInt  = new Integer[listOfNumsStr.length];
        for(int i = 0 ; i < listOfNumsStr.length;i++){
            listOfNumsInt[i] = (Integer.parseInt(listOfNumsStr[i]));
//            System.out.println(listOfNumsInt[i]);
        }
        System.out.println("MIN :"+min(listOfNumsInt));
        System.out.println("MAX :"+max(listOfNumsInt));
    }
}
