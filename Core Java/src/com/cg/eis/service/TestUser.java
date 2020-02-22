package com.cg.eis.service;


import org.junit.Test;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;

public class TestUser {

	@Test (expected= EmployeeException.class)
	public void testSal()throws EmployeeException
	{
		Employee e = new Employee();
		Service s = new Service();
		e.setSalary(3500);
		s.des(e);
	}
}
