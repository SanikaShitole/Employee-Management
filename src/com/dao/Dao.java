package com.dao;

import com.entity.Employee;

public class Dao {
     public Employee oneEmployee() {
    	 return new Employee(101,"sanika",25000,"IT");
     }
     public Employee[] manyEmployee(int size) {
    	Employee[] db=new Employee[size];
    	db[0]=new Employee(101,"sanika",25000,"IT");
    	db[1]=new Employee(102,"achal",25000,"dev");
    	db[2]=new Employee(103,"kiran",25000,"testing");
    	db[3]=new Employee(101,"pawam",25000,"it");
    	db[4]=new Employee(104,"shubham",25000,"dev");
    	return db;
     }
}
