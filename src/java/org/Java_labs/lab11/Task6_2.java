// Class work 11
// JavaLabs5 Task 6.2

package org.Java_labs.lab11;
import java.io.*;
import java.util.Random;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task6_2 {
    public static void write_to_binary_file(String filename, int[] int_values) {
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new FileOutputStream(filename, true));
            for (int value: int_values) {
                dos.writeInt(value);
            }
            dos.flush();
            dos.close();
            System.out.println("Successfully written data to the file");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                assert dos != null;
                dos.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static byte[] read_from_binary_file(String filename) {
        byte[] allBytes = new byte[0];
        try {
            allBytes = Files.readAllBytes(Paths.get(filename));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return allBytes;
    }
    public static int[] to_int_array(byte[] byteArray) {
        int times = Integer.SIZE / Byte.SIZE;
        int[] integers = new int[byteArray.length / times];
        for (int i = 0; i < integers.length; ++i) {
            integers[i] = ByteBuffer.wrap(byteArray, i * times, times).getInt();
        }
        return integers;
    }
    public static void generate_int_rand_file(String filename) {
        int[] intArray = new int[10];
        for (int i = 0; i < 10; ++i) {
            Random rand = new Random();
            intArray[i] = rand.nextInt(200) - 100;
        }
        write_to_binary_file(filename, intArray);
    }
    public static int task_a(int[] integers) {
        int count = 0;
        for (int x: integers) {
            if (x % 2 == 0){
                count += 1;
            }
        }
        return count;
    }
    public static int task_b(int[] integers) {
        int count = 0;
        for (int x: integers) {
            if (x > 0) {
                int temp = (int) Math.sqrt(x);
                if (Math.pow(temp, 2) == x) {
                    count += 1;
                }
            }
        }
        return count;
    }
    public static int task_v(int[] integers) {
        int max_even_num = integers[0];
        int min_odd_num = integers[1];
        for (int i = 0; i < integers.length; i += 2) {
            if (integers[i] > max_even_num) {
                max_even_num = integers[i];
            }
        }
        for(int i = 1; i < integers.length; i += 2) {
            if (integers[i] < min_odd_num) {
                min_odd_num = integers[i];
            }
        }
        return max_even_num - min_odd_num;
    }
    public static int task_h(int[] integers) {
        int longest_sequence = 1;
        int prev = integers[0];
        int curr_sequence = 1;
        for(int i = 1; i < integers.length; ++i) {
            if (integers[i] > prev){
                curr_sequence += 1;
            } else {
                if (curr_sequence > longest_sequence) {
                    longest_sequence = curr_sequence;
                }
                curr_sequence = 1;
            }
            prev = integers[i];
        }
        return longest_sequence;
    }
    public static void main(String[] args) {
        generate_int_rand_file("file_of_int_numbers.dat");
        int[] given_data = to_int_array(read_from_binary_file("file_of_int_numbers.dat"));
        System.out.println("Generated values");
        for (int x: given_data) {
            System.out.print(x + " ");
        }
        System.out.println("а: " + task_a(given_data));
        System.out.println("б: " + task_b(given_data));
        System.out.println("в: " + task_v(given_data));
        System.out.println("г: " + task_h(given_data));
    }
}