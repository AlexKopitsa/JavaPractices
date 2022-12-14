// Additional tasks
// Collect Task 1

package org.Java_labs.Additional_tasks;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        List<String> strings = new ArrayList<>();
        while (line != null) {
            System.out.println(line);
            strings.add(line);
            line = br.readLine();
        }
        FileWriter fw = new FileWriter("output.txt", false);
        Collections.reverse(strings);
        System.out.println(strings);
        for(String string : strings){
            fw.write(string + "\n");
        }
        fw.flush();
    }
}