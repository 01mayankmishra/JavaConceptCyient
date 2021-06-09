package com.cyient.datatypes;

public class DatatypesTest {

	public static void main(String[] args) {
		byte a=100;//taking less memory 8bit per no.
	System.out.println(a);
	int b=100;//taking more memory 32bit per no 
	System.out.println(b);
	}
//suppose 1000 student percentage we hav to store
	//and range of byte os -128 to 127 hence byte is best option then int
	//coz byte---- 1000*8=8000 bits
	//     int----- 1000*32=32000 bits
}
