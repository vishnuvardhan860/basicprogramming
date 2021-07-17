package com.basicprograms;

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {

		// Taking input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number to Find it's Harmonic Number : ");
		int inputNumber = sc.nextInt();
		sc.close();
		double harmonicNumber = 0;

		// logic
		if (inputNumber > 0){
			for (int i = 1; i <= inputNumber; i++){
				harmonicNumber += (1.0 / i);
			}
			System.out.printf("Harmonic Number is :%.4f ",harmonicNumber);
		} else {
			System.out.println("Number Should be Graeter Than 0");
		}
	}
} 