package com.basicprograms;

import java.util.Scanner;

public class LargestAmongThree {
	public static void main(String[] args) {

		// inputs
		Scanner sc = new Scanner(System.in);
        System.out.print("Please input 3 integers: ");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();
        sc.close();

        // logic
        int largestNumber = Math.max(Math.max(firstNumber,secondNumber),thirdNumber);
        System.out.println("The Largest Among Three Numbers is: " + largestNumber);
	}
} 