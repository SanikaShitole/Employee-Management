package com.controller;

import com.entity.Employee;
import com.service.Service;

public class Controller {
	  Service service;
      public Employee controlAPI() {
    	  service=new Service();
    	  Employee e1=service.s1();
    //	  System.out.println(e1);
    	   return e1;
      }   
    	   public Employee[] controlAPIMany() {          
    	    	  service=new Service();
    	    	  Employee[] arrEmp = service.controlAPIManyService();
    	    	  return arrEmp;
      }
}
