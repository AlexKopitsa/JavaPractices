// Home work 1
// JavaLabs1_2 Task 2.x (2.2, тому що я 9-ий в списку, а завдань 7)

package org.Java_hw.hw1_2_3_4;
import java.util.Scanner;

public class Task2_2 {
	private String num1;
	private String num2;
	public Task2_2() {
		num1 = getNumbers();
		num2 = getNumbers();
		findBitRate(num1);
		findBitRate(num2);
		double number = Double.parseDouble(num1) * Double.parseDouble(num2);
		System.out.printf("%.2f" , Math.sqrt(number));
	}
	private String getNumbers() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number:");
		return scanner.nextLine();
	}
	private void findBitRate(String number) {
		int bitRate = 0;
		boolean flag = true;
		if (number.length() == 1) {
			bitRate = 1;
		} else {
			for (int i = 0; i < number.length(); i++) {
				if (Character.isDigit(number.charAt(i))) {
					int checkNum = Integer.parseInt(String.valueOf(number.charAt(i)));
					if (checkNum > 0) {
						bitRate += 1;
					}
				} else {
					flag = false;
					break;
				}
			}
		}
		if (flag) {
			System.out.println(bitRate + " for number: " + number);
		} else {
			System.out.println("not a number");
		}
	}
}