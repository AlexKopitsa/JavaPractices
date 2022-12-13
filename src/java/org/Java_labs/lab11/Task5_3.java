// Class work 11
// JavaLabs5 Task 5.3

package org.Java_labs.lab11;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Task5_3 {
    public static void task_a(String filename) {
        FileReader fr = null;
        try {
            fr = new FileReader(filename);
            Scanner fsc = new Scanner(fr);
            while (fsc.hasNext()) {
                System.out.println(fsc.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void task_b(String filename) {
        FileReader fr = null;
        try {
            fr = new FileReader(filename);
            Scanner fsc = new Scanner(fr);
            while (fsc.hasNext()) {
                String line = fsc.nextLine();
                if (line.length() > 60) {
                    System.out.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void task_vh(String filename, char symbol) {
        FileReader fr = null;
        try {
            fr = new FileReader(filename);
            Scanner fsc = new Scanner(fr);
            int res = 0;
            while (fsc.hasNext()) {
                String line = fsc.nextLine();
                line = line.strip();
                if(!line.equals("") && Character.toLowerCase(line.charAt(0)) == symbol) {
                    res += 1;
                }
            }
            System.out.printf("Number of lines that begin with {%c}: %d ", symbol, res);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void task_vd(String filename, char symbol) {
        FileReader fr = null;
        try {
            fr = new FileReader(filename);
            Scanner fsc = new Scanner(fr);
            int res = 0;
            while(fsc.hasNext()) {
                String line = fsc.nextLine();
                line = line.strip();
                if(!line.equals("") && Character.toLowerCase(line.charAt(line.length() - 1)) == symbol) {
                    res += 1;
                }
            }
            System.out.printf("Number of lines that end with {%c}: %d ", symbol, res);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void task_ve(String filename) {
        FileReader fr = null;
        try {
            fr = new FileReader(filename);
            Scanner fsc = new Scanner(fr);
            int res = 0;
            while (fsc.hasNext()) {
                String line = fsc.nextLine();
                line = line.strip();
                if (!line.equals("") &&
                Character.toLowerCase(line.charAt(line.length() - 1)) == Character.toLowerCase(line.charAt(0)))
                {
                    res += 1;
                }
            }
            System.out.printf("Number of lines that start and end with the same char: %d ", res);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void task_vee(String filename) {
        FileReader fr = null;
        try {
            fr = new FileReader(filename);
            Scanner fsc = new Scanner(fr);
            int res = 0;
            while (fsc.hasNext()) {
                String line = fsc.nextLine();
                line = line.strip();
                if (!line.equals("") && line.replace(" ", "").chars().distinct().count() == 1) {
                    System.out.println(line);
                    res += 1;
                }
            }
            System.out.printf("Number of lines that consist of the same symbols: %d ", res);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args){
        String filename = "input.txt";
        task_a(filename);
        task_b(filename);
        task_vh(filename, 't');
        task_vd(filename, '.');
        task_ve(filename);
        task_vee(filename);
    }
}
