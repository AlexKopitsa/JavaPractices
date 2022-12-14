// Class work 10
// JavaLabs5 Task 1.3 

package org.Java_labs.lab10;
import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String input = sc.nextLine().replace("small", "very large");
        System.out.println("New text: " + input);
    }
}
