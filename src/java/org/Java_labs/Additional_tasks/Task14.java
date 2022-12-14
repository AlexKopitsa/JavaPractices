// Additional tasks
// Collect Task 14

package org.Java_labs.Additional_tasks;
import java.util.*;
import java.io.FileReader;
import java.io.IOException;

public class Task14 {
    public static void main(String[] args) {
        String filename = "input2.txt";
        ArrayList<String> lines = new ArrayList<>();
        FileReader fr;
        try {
            fr = new FileReader(filename);
            Scanner sc = new Scanner(fr);
            System.out.println("Lines:\n");
            while (sc.hasNext()) {
                String line = sc.nextLine();
                System.out.println(line);
                lines.add(line);
            }
            fr.close();
            Collections.sort(lines);
            System.out.println("\nSorted lines:\n");
            for (String line: lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}