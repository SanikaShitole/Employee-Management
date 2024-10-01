package com.Testing;

import com.controller.Controller;
import com.entity.Employee;

public class TestEmployeeProject {
    public static void main(String[] args) {
//		Controller c1=new Controller();
//	 System.out.println(c1.controlAPI());
		
//    	Employee empArr[]= c1.controlAPI();
//    	for(Employee e: empArr) {
//    		System.out.println(e.getSal());
    		
	 Controller c2=new Controller();
	 System.out.println(c2.controlAPIMany());
	 Employee[] empArr=c2.controlAPIMany();
	 System.out.println( empArr);    //array address
	 
	 //how to print array .....for loop
//	   for(int i=0; i<empArr.length; i++) {
//		   System.out.println(empArr[i]);
//		   
	   }
    	}
	
    

