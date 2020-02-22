package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;
import java.io.*;

import java.util.*;

interface EmployeeService
{
	void des(Employee e);
}

@SuppressWarnings("serial")
public class Service implements EmployeeService,Serializable 
{
	Employee e = new Employee();
	public static final String path = "D:\\Vijay\\Core java\\objfile.txt";
	
	@Override
	public void des(Employee e)throws EmployeeException
	{
			if(e.getSalary()<=5000 && e.getSalary()>=3000)
			{
				e.setDesignation("Clerk");
				e.setInsuranceScheme("No Scheme");
			}
			else if(e.getSalary()>5000 && e.getSalary()<20000)
			{
				e.setDesignation("System Associate");
				e.setInsuranceScheme("Scheme C");
			}
			
			else if(e.getSalary()>=20000 && e.getSalary()<40000)
			{
				e.setDesignation("Programmer");
				e.setInsuranceScheme("Scheme B");
			}
			
			else if(e.getSalary()>=40000)
			{
				e.setDesignation("Manager");
				e.setInsuranceScheme("Scheme A");
			}
			else
			{
				throw new EmployeeException("Salary cannot be less than 3000");
			}
		
	}
	
	public void writeObjectToFile(Object empob)
	{
		try 
		{
			FileOutputStream fo = new FileOutputStream("D:\\Vijay\\Core java\\objfile.txt");
			File f = new File("D:\\Vijay\\Core java\\objfile.txt");
			ObjectOutputStream ob = new ObjectOutputStream(fo);
			ob.writeObject(empob);
			ob.close();
			System.out.println("The object was added to->"+f.getAbsolutePath());
		} 
		catch (Exception ex) 
		{
			ex.printStackTrace();
		}
	}
	
	public Object readObjectFromFile(String path)
	{
		try
		{
			FileInputStream fi = new FileInputStream(path);
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			Object o = oi.readObject();
			oi.close();
			System.out.println("========================");
			System.out.println("Object has been read from the file:");
			return o;
		}
		catch(Exception e)
		{
			System.out.println("Error in reading object:"+e.getMessage());
			return null;
		}
	}

}
