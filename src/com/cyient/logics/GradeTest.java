package com.cyient.logics;

public class GradeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p=33;
		
		 if(p>90&& p<=100) {System.out.println("A Grade");}
		else if(p>80&& p<=89) {System.out.println("B Grade");}
		else if(p>60&& p<=79) {System.out.println("C Grade");}
		else if(p>=33&& p<=59) {System.out.println("D Grade");}
		else if(p<33) {System.out.println("F Grade");}
	}

}
