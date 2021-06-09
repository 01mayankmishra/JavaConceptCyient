package com.cyient.javaassignment;

import java.util.Scanner;

public class FifthProblem {

	public static void main(String[] args) {
		// 7.	Write a program that takes input array 
		//daily temperatures, as floats. and findout the maximum and minimum values.
		Scanner sc=new Scanner(System.in);

		float[] arr=new float[5];

			System.out.print("Enter the temerature:");
			for(int i=0;i<5;i++)
			{
				arr[i]=sc.nextFloat();
			}
			float max=0,min=arr[0];
			for(int i=0;i<5;i++)
			{
				if(arr[i]>max)
				{
					max=arr[i];
				}
				else if(arr[i]<min)
				{
					min=arr[i];
				}
			}
			System.out.println("Maximum Temperature value is:" +max);
			System.out.println("Minimum Temperature value is:" +min);

	}

}
