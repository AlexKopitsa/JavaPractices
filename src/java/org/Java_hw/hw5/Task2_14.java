// Home work 5
// JavaLabs3 Task 2.14 

package org.Java_hw.hw8;
import java.util.Arrays;
import java.util.Scanner;

public class Task2_14 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[] cols = new int[N], rows = new int[N];
        Arrays.fill(cols, 0);
        Arrays.fill(rows, 0);
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                System.out.printf("A[%d][%d]: ", i, j);
                int el = scan.nextInt();
				rows[i] += el;
                cols[j] += el;
            }
        }
        int counter = 0, c = -1, r = -1;
        for (int i = 0; i < N; i++) {
            if (cols[i] % 2 == 1) {
                counter++;
                c = i;
            }
            if (rows[i] % 2 == 1) {
                counter++;
                r = i;
            }
        }
		if (counter < 2) {
            System.out.print("The matrix has the parity property");
        } else if (counter == 2){
            System.out.printf("Corrupted bit: (%d, %d)", r + 1, c + 1);
        } else System.out.print("Matrix was damaged");
    }
}
