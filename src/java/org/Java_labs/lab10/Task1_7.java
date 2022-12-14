// Class work 10
// JavaLabs5 Task 1.7

package org.Java_labs.lab10;
import java.util.Scanner;

public class Task1_7 {
    public static int countChars(String text) {
        String[] words = text.split(" ");
        String new_string = String.join("", words);
        return new_string.length();
    }
    public static int countWords(String text) {
        String regex = "[\\p{Punct}\\s]+";
        String[] words = text.split(regex);
        return words.length;
    }
    public static int countPunctMarks(String text) {
        String regex = "[\\p{Punct}]+";
        String[] words = text.split(regex);
        return words.length - 1;
    }
    public static int countSentences(String text) {
        String regex = "[.?!]";
        String[] sentences = text.split(regex);
        return sentences.length;
    }
    public static void main(String[] args) {
        if(args.length > 0) {
            String input = args[0];
            System.out.println("Number of characters: " + countChars(input));
            System.out.println("Number of words: " + countWords(input));
            System.out.println("Number of punctuation marks: " + countPunctMarks(input));
            System.out.println("Number of sentences: " + countSentences(input));
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input text: ");
            String input = sc.nextLine();
            System.out.println("Number of characters: " + countChars(input));
            System.out.println("Number of words: " + countWords(input));
            System.out.println("Number of punctuation marks: " + countPunctMarks(input));
            System.out.println("Number of sentences: " + countSentences(input));
        }
    }
}
