// Home work 11
// JavaLabs5 Task 5.4 

package org.Java_hw.hw11;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;

public class Task5_4 {
    public static boolean rewrite_with_replacement(String file_F, String file_G) {
        try {
            FileReader fr = new FileReader(file_F);
            Scanner file = new Scanner(fr);
            FileWriter fw = new FileWriter(file_G);
            while (file.hasNextLine()) {
                String line = file.nextLine();
                line = line.replaceAll("0", "1");
                fw.write(line + "\n");
            }
            fr.close();
            fw.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public static boolean rewrite_inverted(String file_F, String file_G) {
        try {
            FileReader fr = new FileReader(file_F);
            Scanner file = new Scanner(fr);
            StringBuilder line = new StringBuilder();
            while (file.hasNextLine()) {
                line.append(file.nextLine() + "\n");
            }
            line.reverse();
            FileWriter fw = new FileWriter(file_G);
            fw.write(line.toString());
            fr.close();
            fw.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public static void main(String[] args) {
        rewrite_with_replacement("input", "output1");
        rewrite_inverted("input", "output2");
    }
}