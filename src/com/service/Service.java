package com.service;

import com.dao.Dao;
import com.entity.Employee;

public class Service {
       Dao obj1=null;
       
      public Employee s1() {
    	  obj1=new Dao();
    	  Employee e1=obj1.oneEmployee();
    	  return e1;
      }
      public Employee[] controlAPIManyService() {
    	  obj1=new Dao();
    	  Employee[] arrayofEmp=obj1.manyEmployee(0);
    	  return arrayofEmp;
      }
}
