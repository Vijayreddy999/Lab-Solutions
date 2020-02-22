package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;
import com.cg.eis.service.Service;
import java.util.*;

public class User 
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		Employee e[] = new Employee[10];
		Service s = new Service();
		EmployeeServiceImpl es= new EmployeeServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employees");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			e[i]=new Employee();
			System.out.println("Enter Employee Id:");
			int id = sc.nextInt();
			e[i].setId(id);
			
			System.out.println("Enter Employee Name:");
			String dummy = sc.nextLine();
			String name = sc.nextLine();
			e[i].setName(name);
		
			System.out.println("Enter Employee salary:");
			int sal = sc.nextInt();
			e[i].setSalary(sal);
			//s.writeObjectToFile(e[i]);
			
			s.des(e[i]);
			es.addEmployee(e[i]);
			/*
			e[i]=(Employee)s.readObjectFromFile("D:\\Vijay\\Core java\\objfile.txt");
			System.out.println("Employee id:"+e[i].getId());
			System.out.println("Employee Name:"+e[i].getName());
			System.out.println("Employee Salary:"+e[i].getSalary());
			s.des(e[i]);
			System.out.println("Employee Designation:"+e[i].getDesignation());
			System.out.println("Employee scheme:"+e[i].getInsuranceScheme());
			System.out.println("================================");*/
		}
		es.display();
		//es.sortSal();
		/*System.out.println("Enter insurance scheme:");
		String dupe = sc.nextLine();
		String scheme = sc.nextLine();
		es.schemeDetails(scheme);*/
		System.out.println("Enter id of Employee you want to remove:");
		int eid = sc.nextInt();
		es.deleteEmployee(eid);
		//System.out.println("Updated results after deleting the employee:");
		//es.display();
		
		
	}
}
