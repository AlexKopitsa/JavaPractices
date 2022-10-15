package org.Java_labs.lab3;
import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n and m");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("n: " + Integer.toBinaryString(n));

        boolean addOne;
        char bit = Integer.toBinaryString(n).charAt(m-1);
        if (bit == '1') {
            addOne = true;
            System.out.println("bit before: 1");

        }else{
            addOne = false;
            System.out.println("bit before: 0");

        }

        int newNum = n ^ (1 << m);

        System.out.println("(result)New number: " + newNum);
        
    }
}
