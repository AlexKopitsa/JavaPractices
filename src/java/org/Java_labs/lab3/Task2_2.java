package org.javapractices.lab3;
import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        int a = 0b1101010; //106
        a = a<<1;
        while (a != 0) {
            a = a>>1;
            System.out.println("number: " + Integer.toBinaryString(a));
        }
    }
}
