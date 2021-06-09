package com.cyient.javaassignment;

import java.util.Scanner;

public class SixthProblem {

	public static void main(String[] args) {
		//8. Write a program which takes 
		//input as integer and display the binary triangle on the basis of input integer
		int i,j,rows;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		rows=scan.nextInt();
		for(i=1; i<=rows; i++){
		  for(j=1; j<=i; j++){
		  if(j%2==1){
		      System.out.print("0");
		  }
		  else{
		      System.out.print("1");
		  }
		  
		}
		System.out.println();
		}

	}

}
