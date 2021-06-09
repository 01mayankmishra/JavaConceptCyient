package com.cyient.employee;

public class Employee {
public int empNo;
public String empName;
public double empSalary;
public static String companyName;

public static void printEmployeeDtails(Employee e){
	System.out.println(e);
	System.out.println("------------------------------------");
    System.out.println("Employee No"+e.empNo);
	System.out.println("Employee Namer"+ e.empName);
	System.out.println("Employee Salary"+ e.empSalary);
	System.out.println("Company Name"+ Employee.companyName);
}

public void printEmployeeRecord() {
	System.out.println(empNo);
	System.out.println(empName);
	System.out.println(empSalary);
	System.out.println(Employee.companyName);
	
//	public void printMaxSalary() {
	//	if(emp1.empSalary>emp2.empSalary) {System.out.println(emp1.empName+"salary is more"+emp1.empSalary);}
//		else
//		System.out.println(emp2.empName+"salary is more"+emp2.empSalary);
	}
}
