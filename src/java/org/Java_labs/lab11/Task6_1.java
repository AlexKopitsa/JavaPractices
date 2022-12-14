// Class work 11
// JavaLabs5 Task 6.1

package org.Java_labs.lab11;
import java.io.*;
import java.util.Random;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task6_1 {
    public static void write_to_binary_file(String filename, double[] double_values) {
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new FileOutputStream(filename, true));
            for (double value: double_values) {
                dos.writeDouble(value);
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
    public static double[] to_double_array(byte[] byteArray) {
        int times = Double.SIZE / Byte.SIZE;
        double[] doubles = new double[byteArray.length / times];
        for (int i = 0; i < doubles.length; ++i) {
            doubles[i] = ByteBuffer.wrap(byteArray, i * times, times).getDouble();
        }
        return doubles;
    }
	static void generate_double_rand_file(String filename) {
        double[] testData = new double[10];
        for (int i = 0; i < 10; ++i) {
            Random rand = new Random();
            testData[i] = -100.0 + 200.0 * rand.nextDouble();
        }
        write_to_binary_file(filename, testData);
    }
    static double task_a(double[] doubles) {
        double sum = 0;
        for (double x: doubles) {
            sum += x;
        }
        return sum;
    }
    static int task_b(double[] doubles) {
        int count = 0;
        for (double x: doubles) {
            if (x < 0) {
                count += 1;
            }
        }
        return count;
    }
    static double task_v(double[] doubles) {
        return doubles[doubles.length - 1];
    }
    static double task_h(double[] doubles) {
        double max = doubles[0];
        for (int i = 1; i < doubles.length; ++i) {
            if (doubles[i] > max) {
                max = doubles[i];
            }
        }
        return max;
    }
    static double task_d(double[] doubles) {
        double min = doubles[0];
        for (int i = 2; i < doubles.length; i += 2) {
            if (doubles[i] < min && i % 2 ==0) {
                min = doubles[i];
            }
        }
        return min;
    }
    static double get_min(double[] doubles) {
        double min = doubles[0];
        for (int i = 1; i < doubles.length; ++i) {
            if (doubles[i] < min) {
                min = doubles[i];
            }
        }
        return min;
    }
    static double task_ye(double[] doubles) {
        return doubles[0] - doubles[doubles.length - 1];
    }
    static int task_j(double[] doubles) {
        int res = 0;
        double mean = 0;
        for (double x: doubles) {
            mean += x;
        }
        mean = mean / doubles.length;
        for (double x: doubles) {
            if (x < mean) {
                res += 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        generate_double_rand_file("file_of_real_numbers.dat");
        double[] given_data = to_double_array(read_from_binary_file("file_of_real_numbers.dat"));
        for (double x: given_data) {
            System.out.print(x + " ");
        }
        System.out.println("a: " + task_a(given_data));
        System.out.println("б: " + task_b(given_data));
        System.out.println("в: " + task_v(given_data));
        double max = task_h(given_data);
        System.out.println("г: " + max);
        System.out.println("д: " + task_d(given_data));
        System.out.println("е: " + (max - get_min(given_data)));
        System.out.println("є: " + task_ye(given_data));
        System.out.println("ж: " + task_j(given_data));
    }
}