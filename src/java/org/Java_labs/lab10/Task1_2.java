// Class work 10
// JavaLabs5 Task 1.2 

package org.Java_labs.lab10;
import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        if (args.length > 0) {
            String input = args[0];
            StringBuilder sb = new StringBuilder(input);
            sb.reverse();
            System.out.println("Reversed text: " + sb);
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input text: ");
            String input = sc.nextLine();
            StringBuilder sb = new StringBuilder(input);
            sb.reverse();
            System.out.println("Reversed text: " + sb);
        }
    }
}
