// Class work 10
// JavaLabs5 Task 1.8

package org.Java_labs.lab10;
import java.util.Scanner;

public class Task1_8 {
    public static void main(String[] args) { 
        if (args.length > 0) {
            String input = args[0];
            String word = args[1];
            System.out.print("Depending on the case: ");
            System.out.println(input.contains(word));
            System.out.print("Regardless of case: ");
            System.out.println(input.toLowerCase().contains(word.toLowerCase()));
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input text: ");
            String input = sc.nextLine();
            System.out.print("Input word: ");
            String word = sc.next();
            System.out.print("Depending on the case: ");
            System.out.println(input.contains(word));
            System.out.print("Regardless of case: ");
            System.out.println(input.toLowerCase().contains(word.toLowerCase()));
        }
    }
}
