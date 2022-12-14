// Class work 10
// JavaLabs5 Task 1.1 

package org.Java_labs.lab10;
import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        String regex = "[\\p{Punct}\\s]+";
        if (args.length > 0) {
            String input = args[0];
            String[] words = input.split(regex);
            System.out.println("Number of words: " + words.length);
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input text: ");
            String input = sc.nextLine();
            String[] words = input.split(regex);
            System.out.println("Number of words: " + words.length);
        }
    }
}
