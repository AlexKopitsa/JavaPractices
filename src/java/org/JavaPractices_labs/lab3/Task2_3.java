package org.javapractices.lab3;
import java.util.Scanner;

public class Task2_3 {
    public static void main(String[] args) {
        returnBinary('2');
        returnBinary('7');
        returnBinary('c');
        returnBinary('A');
    }

    public static void returnBinary(char c) {
        System.out.println("char: " + Integer.toBinaryString(c));
    }
}
