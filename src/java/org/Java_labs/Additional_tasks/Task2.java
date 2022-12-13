// Additional tasks
// Collect Task 2

package org.Java_labs.Additional_tasks;
import java.util.Stack;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Stack<Integer> sti = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        while (number > 1) {
            int part = number % 10;
            sti.push(part);
            number = number / 10;
        }
        System.out.println("Reversed number: ");
        for (Integer digit: sti) {
            System.out.print(digit);
        }
    }
}
