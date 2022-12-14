// Home work 2
// JavaLabs1_2 Task 4.6(b)

package org.Java_hw.hw1_2_3_4;
import java.lang.Math;
import java.util.Scanner;

public class task4_6b {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("Input x: ");
		double t = in.nextDouble();
		in.close();
		System.out.println(t);
		double fx = bent(t);
		double gx = bent_deritative(t);
		System.out.printf("f(x) = %f\n", fx);
		System.out.printf("g(x) = %f", gx);
	}
	public static double bent(double x) {
		double f = (Math.sqrt(x * x + 1) - 1) / 2 + x;
		return f;
	}
	public static double bent_deritative(double x) {
		double g = x / (2 * Math.sqrt(x * x + 1)) + 1;
		return g;
	}
}