package com.basicprograms;

import java.util.Scanner;

public class VowelOrConsonent {
	public static void main(String[] args) {

		// input
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter an Alphabet : ");
	    char c = sc.next().charAt(0);
	    sc.close();

	    // logic
	    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' )
	    	System.out.println(c + " is Vowel");
	    else
	    	System.out.println(c + " is Consonant");
	}
} 