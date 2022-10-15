package org.Java_labs.lab4;
import java.util.Arrays;

public class Task1_1 {
    public static void main(String[] args) {
        String[] strings = new String[15] ;
        Arrays.fill(strings, new String("."));
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
