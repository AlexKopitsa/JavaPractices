package org.Java_labs.lab1;

import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        System.out.println("Enter the degree in celsium :");
        Scanner scanIn = new Scanner(System.in);
        double C, F;
        C = scanIn.nextDouble();
        F = 9 * (C/5) +32 ;
        System.out.println("F = " + F);
    }
}
