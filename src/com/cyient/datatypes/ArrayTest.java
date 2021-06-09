package com.cyient.datatypes;

public class ArrayTest {

	public static void main(String[] args) {
		// 5 int --->10,20,30,,40,50
		int[] numbers = new int[5];
		// new keyword is creating a memory
		// numbers is variable name
		// starts from 0th index
		numbers[0] = 10;
		System.out.println(numbers);
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);// gives default value as 0
		numbers[1] = 20;// we assigned 20 at 1st place of aaray
		System.out.println(numbers[1]);// now it gives o/p as 20

		double[] doubles = new double[3];
		doubles[0] = 10;
		doubles[1] = 20.20;
		doubles[2] = 56.50;
		System.out.println(doubles[0]);
		System.out.println(doubles[1]);
		System.out.println(doubles[2]);

		String[] strArr = new String[4]; // {"red","blue","green","yellow"};
		strArr[0] = "red";
		strArr[1] = "blue";
		strArr[2] = "green";
		strArr[3] = "yellow";

		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		System.out.println(strArr[3]);

	}

                          }
