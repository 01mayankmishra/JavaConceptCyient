package com.cyient.student;

public class Student {
	public int RollNo;
	public String StuName;
	public String StuEMailId;
	public String StuAddress;
	public double StuPercent;
	public static String SchoolAddress;
	public static String SchoolName;

	public static void printStudentsDetails(Student s) {
		System.out.println("Roll No of Student:" + s.RollNo);
		System.out.println("Name of Student:" + s.StuName);
		System.out.println("Email Id of Student:" + s.StuEMailId);
		System.out.println("Address of Student:" + s.StuAddress);
		System.out.println("Percentage of Student:" + s.StuPercent);
        System.out.println("School of Address:" + Student.SchoolAddress);
		System.out.println("School Name:" + Student.SchoolName);

	}
}
