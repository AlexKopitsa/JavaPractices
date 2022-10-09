package com;

import java.util.Scanner;

public class Task3_5 {
	private int[] arr = new int[5];

	public Task3_5() {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("input number:");
			arr[i] = scanner.nextInt();
		}

		boolean needIteration = true;
		while (needIteration) {
			needIteration = false;
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] < arr[i - 1]) {
					int t = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = t;
					needIteration = true;
				}
			}
		}
		System.out.println(arr[2]);

	}

}
