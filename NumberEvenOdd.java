package com.basicprograms;

import java.util.Scanner;

public class NumberEvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter any number");

		int num = sc.nextInt();

		if(num%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}
}