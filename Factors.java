package com.basicprograms;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {

		// Taking input from user
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Integer to Find It's Prime Factors: ");
        int inputNumber = sc.nextInt();
        sc.close();
        int flag = 0;
        int count = 0;
        int findFactor = 0;

        // logic
        for (int i = 2; i < inputNumber; i++){
            if (inputNumber % i == 0){
            	findFactor = i;
                for(int j = 2; j <= findFactor / 2; j++){
                    flag = 0;
                    if (findFactor %j == 0){
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0){
                    System.out.println(findFactor);
                    count = 1;
                }
            }
        }
        if(count == 0)
            System.out.println("No Prime Factor Faound Except 1 and "+inputNumber);
	}
} 