// Class work 11
// JavaLabs5 Task 5.1

package org.Java_labs.lab11;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Task5_1 {
    public static void tasks_a_d(String filename, String outputFile) {
        String longest_word = "";
        int num_of_words = 0;
        FileReader fr = null;
        try {
            fr = new FileReader(filename);
            Scanner fsc = new Scanner(fr);
            FileWriter fw = new FileWriter(outputFile);
            while (fsc.hasNext()) {
                String current_str = fsc.nextLine();
                String[] words = current_str.split("\\s+");
                num_of_words += words.length;
                String curr_longest_word = words[0];
                StringBuilder new_string = new StringBuilder();
                for (String x: words){
                    if (x.length() > curr_longest_word.length()) {
                        curr_longest_word = x;
                    }
                    if (x.length() > 1) {
                        new_string.append(x).append(" ");
                    }
                }
                if (curr_longest_word.length() > longest_word.length()) {
                    longest_word = curr_longest_word;
                }
                String result = new_string.toString();
                result = result.strip();
                fw.write(result + "\n");
            }
            System.out.println("Longest word: " + longest_word);
            System.out.println("Number of words: " + num_of_words);
            fr.close();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void tasks_vhd(String filename, String outputFile) {
        FileReader fr = null;
        try {
            fr = new FileReader(filename);
            Scanner fsc = new Scanner(fr);
            FileWriter fw = new FileWriter(outputFile);
            int symbols = 0;
            int words_num = 0;
            int m;
            ArrayList<String> curr_words = new ArrayList<String>();
            while (fsc.hasNext()) {
                String current_str = fsc.nextLine();
                String[] words = current_str.split("\\s+");
                symbols = 0;
                words_num = 0;
                curr_words.clear();
                for(String x: words) {
                    symbols += x.length() + 1;
                    words_num += 1;
                    curr_words.add(x);
                }
                if (1 < words_num && symbols < 80) {
                    m = (80 - symbols) / (words_num - 1);
                    for (String word: curr_words) {
                        fw.write(word);
                        for (int i = 0; i < m; ++i) {
                            fw.write(" ");
                        }
                    }
                    fw.write('\n');
                }
            }
            fr.close();
            fw.close();
        } catch (IOException e) {
			throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws IOException {
        String filename = "input.txt";
        String outputFile1 = "output1.txt";
        String outputFile2 = "output2.txt";
        tasks_a_d(filename, outputFile1);
        tasks_vhd(filename, outputFile2);
    }
}
