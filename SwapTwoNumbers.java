package com.basicprograms;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String args[]) {

		int firstNumber, secondNumber, temp;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		firstNumber = sc.nextInt();
		System.out.println("Enter the second number: ");
		secondNumber = sc.nextInt();

		temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;

		System.out.println("First Number is: "+firstNumber);
		System.out.println("Second Number is: "+secondNumber);
	}
} 
