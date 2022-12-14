// Class work 10
// JavaLabs5 Task 1.5

package org.Java_labs.lab10;
import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String input = sc.nextLine().replace("small", "very small").replace("large", "very large");
        System.out.println("New text: " + input);
    }
}
