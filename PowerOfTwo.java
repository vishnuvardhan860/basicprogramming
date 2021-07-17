package com.basicprograms;

import java.util.Scanner;

public class PowerOfTwo {
	public static void main(String[] args) {

		// Taking input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int inputNumber = sc.nextInt();
		sc.close();

		// logic
		int powerOfTwo = 1;
		if (inputNumber > 0 && inputNumber < 31){
			for (int i = 1; i <= inputNumber; i++){
				powerOfTwo = powerOfTwo * 2;
				System.out.println(2 + " to the Power " +i+ " : "+ powerOfTwo);
			}
		}
		else {
			System.out.println("Your Input Overflows the 'int' datatype Limit");
		}
	}
}