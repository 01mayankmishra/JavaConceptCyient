package com.cyient.javaassignment;

public class FourthProblem {

	public static void main(String[] args) {
		// 6.	Write a program which takes
		//two integers N and M and produces last samples of N of the integers from N-1 to N-M.
		int N =10,M=4;
		for(int i=N-1;i>=(N-M);i--)
		{
			System.out.print(i +" ");
		}

	}

}