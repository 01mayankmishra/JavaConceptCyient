package com.cyient.methods;

public class MethodTest {
// accrssmodifier static returntype then methodname(argument/parameters)
	

	public static void main(String[] args) {

		int b = 10;
		int h = 20;
	//	double reslt = Area.areaOfTriangle(b, h);
		//now here methods belongs to Area class thats why we are calling it 
		//from there like. double reslt = Area.areaOfTriangle(b, h)
		//we dont always need not to have all the methods in same class
		//we call them from any of the class.
	//System.out.println(reslt);
		int r = 10;
		// classname followed by method name this is the pattern of calling a static
		// method;
		double res = Area.areaOfCircle(10);//calling static method
		System.out.println(res);
		int len = 10;
		int wid = 20;
		int result = Area.areaOfRectangle(len, wid);
		System.out.println(result);
		//way of calling nonstatic methods- by creating a object instance 
		//of that class we can call nonstatic methods
		// and we have to remove static keywoed from that method definition 
		//to make it nonstatic.
		NonStaticMethods obj = new NonStaticMethods();
		double output = obj.areaOfTriangle(25, 1);//calling nonstatic methods
		System.out.println(output);
		// area of circle
//double area;
//area= 3.14*radius*radius;
//System.out.println(area);
//	
//radius=20;
////area of circle;
//area= 3.14*radius*radius;
//System.out.println(area);
//
//radius=30;
////area of circle
//area= 3.14*radius*radius;
//System.out.println(area);

//recreation of logic/code should be avoided and we should cre3at a method in these cases.

	}

}
