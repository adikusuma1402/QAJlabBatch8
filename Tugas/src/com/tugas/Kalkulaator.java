package com.tugas;

import java.util.Scanner;

public class Kalkulaator {
	public static void main(String[] args) {

		Scanner inputUser;
		float number1, number2, result = 0;
		char operator = 0;

		inputUser = new Scanner(System.in);

		try {

			System.out.print("Input First Number: ");
			number1 = inputUser.nextInt();

			System.out.print("Input Operator: ");
			operator = inputUser.next().charAt(0);

			System.out.print("Input Second Number: ");
			number2 = inputUser.nextInt();

			inputUser.close();

			if (operator == '+') {
				result = number1 + number2;
			} else if (operator == '-') {
				result = number1 - number2;
			} else if (operator == '*') {
				result = number1 * number2;
			} else if (operator == '/') {
				result = number1 / number2;

				if (number2 == 0) {
					System.out.println("operand can't be zero");
				} else {
					result = number1 / number2;
				}

			} else {
				System.out.println("unknown operator");

			}

		} catch (Exception e) {
			System.out.println("input only Number!!");
		}

		System.out.println("========================");
		System.out.printf("The result = %.1f", result);

	}

}
