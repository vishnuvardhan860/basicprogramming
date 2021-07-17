package com.basicprograms;

public class FlipCoin {
	public static void main(String[] args) {
		System.out.println("Enter how many times you need to flip");
		int flipCount = Utility.getUserInteger();
		int headCount = 0;
		int tailCount = 0;
		for (int i = 0; i <= flipCount; i++) {
		double random = Math.random();
		if (random > 0.5) {
		headCount++;
		} else {
		tailCount++;
			}
		}
		System.out.println("Headcount is :" + headCount + "% =" + calculatePercentage(flipCount, headCount));
		System.out.println("Tailcount is :" + tailCount + "% =" + calculatePercentage(flipCount, tailCount));
		}

		private static double calculatePercentage(int flipCount, int count) {
		return (double)count / flipCount * 100;
		}
}