// Class work 11
// JavaLabs5 Task 6.3

package org.Java_labs.lab11;
import java.io.*;
import java.util.*;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task6_3 {
    public static void write_to_binary_file(String filename, int[] int_values) {
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new FileOutputStream(filename));
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
    public static void task_a(String file_G, int[] integers) {
        List<Integer> newInt = new ArrayList<Integer>();
        for (int x: integers) {
            if (x % 2 == 0) {
                newInt.add(x);
            }
        }
        int[] result = new int[newInt.size()];
        for (int i = 0; i < newInt.size(); i++) {
            result[i] = newInt.get(i);
        }
        write_to_binary_file(file_G, result);
    }
    public static void task_b(String file_G, int[] integers) {
        List<Integer> newInt = new ArrayList<Integer>();
        for (int x: integers) {
            if (x % 15 == 0) {
                newInt.add(x);
            }
        }
        int[] result = new int[newInt.size()];
        for (int i = 0; i < newInt.size(); i++) {
            result[i] = newInt.get(i);
        }
        write_to_binary_file(file_G, result);
    }
    public static void task_v(String file_G, int[] integers) {
        List<Integer> newInt = new ArrayList<Integer>();
        for (int x: integers) {
            int temp = (int) Math.sqrt(x);
            if (Math.pow(temp, 2) == x) {
                newInt.add(x);
            }
        }
        int[] result = new int[newInt.size()];
        for (int i = 0; i < newInt.size(); i++) {
            result[i] = newInt.get(i);
        }
        write_to_binary_file(file_G, result);
    }
    public static void task_h(String file_G, int[] integers) {
        int[] result = new int[integers.length];
        for(int i = 0; i < integers.length; i++) {
            result[i] = integers[integers.length - 1 - i];
        }
        write_to_binary_file(file_G, result);
    }
    public static int count_occurr(int[] integers, int x)
    {
        int res = 0;
        for (int i = 0; i < integers.length; i++)
            if (x == integers[i])
                res++;
        return res;
    }
    public static void task_d(String file_G, int[] integers) {
        List<Integer> newInt = new ArrayList<Integer>();
        for (int x: integers) {
            if (count_occurr(integers, x) == 1) {
                newInt.add(x);
            }
        }
        int[] result = new int[newInt.size()];
        for (int i = 0; i < newInt.size(); i++) {
            result[i] = newInt.get(i);
        }
        write_to_binary_file(file_G, result);
    }
    public static void main(String[] args) {
        int[] given_data = to_int_array(read_from_binary_file("file_of_int_numbers.dat"));
        System.out.println("Generated values");
        for (int x: given_data) {
            System.out.print(x + " ");
        }
        //task_a("file_G.dat", given_data);
        //task_b("file_G.dat", given_data);
        //task_v("file_G.dat", given_data);
        //task_h("file_G.dat", given_data);
        task_d("file_G.dat", given_data);
    }
}