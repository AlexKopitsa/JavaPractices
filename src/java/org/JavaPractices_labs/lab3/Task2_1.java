package org.javapractices.lab3;
import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        int a = 0b1101010; //106
        int b = 0b1010111; //87

        System.out.println("AND: " + Integer.toBinaryString(a&b));
        System.out.println("OR: " + Integer.toBinaryString(a|b));
        System.out.println("XOR: " + Integer.toBinaryString(a^b));
    }
}
