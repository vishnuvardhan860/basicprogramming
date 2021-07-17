package com.basicprograms;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {

		//Taking input from user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Year to check if it's a Leap Year : ");
		int checkYear = scanner.nextInt();
		scanner.close();

		//logic
		if (checkYear > 999){
			if ((checkYear %4 == 0 && checkYear %100 != 0) || checkYear%400 == 0 ) {
				System.out.println(checkYear+ " is a Leap Year");
			}
			else{
				System.out.println(checkYear+ " is Not a Leap Year");
			}
		}
		else{
			System.out.println("Plase Enter Year in 4 Digits");
		}
	}
}