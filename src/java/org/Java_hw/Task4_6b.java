package com;

public class Task4_6b {
	public void bent(double x) {
		System.out.println(((Math.sqrt(x * x + 1) - 1) / 2) + x);
	}

	public void bent_derivative(double x) {
		System.out.println((x / (2 * Math.sqrt(x * x + 1))) + 1);
	}
}
