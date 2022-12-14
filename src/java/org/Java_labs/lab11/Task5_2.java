// Class work 11
// JavaLabs5 Task 5.2

package org.Java_labs.lab11;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Task5_2 {
    public static void tasks_a_b(String filename) {
        FileReader fr = null;
        try {
            fr = new FileReader(filename);
            Scanner fsc = new Scanner(fr);
            long max_line_length = 0;
            int num_of_empty_lines = 0;
            while (fsc.hasNext()) {
                String curr_line = fsc.nextLine();
                if (curr_line.length() > max_line_length) {
                    max_line_length = curr_line.length();
                }
                if (curr_line.equals("")) {
                    num_of_empty_lines += 1;
                }
            }
            System.out.println("Number of empty lines " + num_of_empty_lines);
            System.out.println("The maximal length of a line " + max_line_length);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        String filename = "input.txt";
        tasks_a_b(filename);
    }
}
