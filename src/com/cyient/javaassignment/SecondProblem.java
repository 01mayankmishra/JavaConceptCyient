package com.cyient.javaassignment;

public class SecondProblem {

	public static void main(String[] args) {
		// 3. Create a program to display sum of even results find the result
		// and check whether it is odd or even? (Range is 0 to 50)

		int i, sum = 0;
		for (i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				sum = sum + i;

			}

		}
		System.out.println(sum);
		if (sum % 2 == 0) {
			System.out.println("sum is even");
		}

		else
			System.out.println("sum is odd");
	}
}
