// Class work 10
// JavaLabs5 Task 1.4

package org.Java_labs.lab10;
import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {
        String regex = "\\s+(a(|n))\\s+";
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String input = sc.nextLine();
        String[] parts = input.split(regex);
        String res = String.join(" ", parts);
        System.out.println(res);
    }
}
