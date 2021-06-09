package com.cyient.employee;


public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
	        Employee.companyName="Cyient";
	        Employee emp1= new Employee();
	        emp1.empNo= 101;
	        emp1.empName="John";
	        emp1.empSalary=5000.0;
	       // Employee.printEmployeeDtails(emp1);; ptinting details with object
	      //  emp1.companyName= "Cyient";
	        emp1.printEmployeeRecord();//printing details with refrence of method
	        Employee emp2= new Employee();
	        emp2.empNo= 102;
	       emp2.empName="Peter";
	        emp2.empSalary=4000.0;
	     //   emp2.companyName= "Cyient";
        //   Employee.printEmployeeDtails(emp2);
	        emp2.printEmployeeRecord();
	        Employee emp3= new Employee();
	        emp3.empNo= 103;
	        emp3.empName="Mark";
	        emp3.empSalary=2000.0;
	        emp3.companyName= "Cyient";
	        emp3.printEmployeeRecord();
	}
}
