package com.cyient.loops;

public class LoopTest {

	public static void main(String[] args) {
	//	for(i=1; i<=10;i=i+1) {
		//	System.out.println(i);
		//}
		int[] numbers = {10,20,30,40,50,60,80,55,42,8,64,25,35};
		int size = numbers.length;
		System.out.println(size);
		for(int i=0; i<size; i++) {
			if(numbers[i]<=50) {
			System.out.println(numbers[i]);
			}}
	}

}
