
package com.cg.eis.pl;

//import java.util.*;
//import java.util.Map.Entry;

import java.sql.*;
import com.cg.eis.bean.*;

public class EmployeeServiceImpl 
{
	//HashMap<String,Employee> list = new HashMap<String,Employee>();
	//Employee e;
	public void addEmployee(Employee emp)
	{
		//list.put(emp.getName(),emp);
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			Connection con = DriverManager.getConnection(url,"sys as sysdba","6684");
			PreparedStatement pst = con.prepareStatement("insert into emp_user values(?,?,?,?,?)");
			pst.setInt(1,emp.getId());
			pst.setString(2,emp.getName());
			pst.setInt(3, emp.getSalary());
			pst.setString(4,emp.getDesignation());
			pst.setString(5, emp.getInsuranceScheme());
			pst.execute();
			System.out.println("Employee successfully added to database");
		}
		catch(Exception ex)
		{
			System.out.println("Error:"+ex.getMessage());
		}
	}
	
	@SuppressWarnings("rawtypes")
	public void display()
	{
		/*Set<Entry<String,Employee>> set = list.entrySet();
		Iterator<Entry<String,Employee>> it = set.iterator();
		while(it.hasNext())
		{
			Map.Entry me = (Map.Entry)it.next();
			e = (Employee)me.getValue();
			System.out.println("-----------------------------------------");
			System.out.println("Employee id:"+e.getId());
			System.out.println("Employee name:"+e.getName());
			System.out.println("Employee salary:"+e.getSalary());
			System.out.println("Employee designation:"+e.getDesignation());
			System.out.println("Employee scheme:"+e.getInsuranceScheme());
			System.out.println("-----------------------------------------");
		}*/
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			Connection con = DriverManager.getConnection(url,"sys as sysdba","6684");
			Statement stmt = con.createStatement();
			String sql = "select * from emp_user";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int sal = rs.getInt(3);
				String des = rs.getString(4);
				String scheme = rs.getString(5);
				System.out.println("-----------------------------------------");
				System.out.println("Employee id:"+id);
				System.out.println("Employee name:"+name);
				System.out.println("Employee salary:"+sal);
				System.out.println("Employee designation:"+des);
				System.out.println("Employee scheme:"+scheme);
				System.out.println("-----------------------------------------");
			}
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println("Error:"+ex.getMessage());
		}
	}
	
	@SuppressWarnings("rawtypes")
	public boolean deleteEmployee(int id)
	{
		/*Set<Entry<String,Employee>> set = list.entrySet();
		Iterator<Entry<String,Employee>> it = set.iterator();
		while(it.hasNext())
		{
			Map.Entry me = (Map.Entry)it.next();
			e = (Employee)me.getValue();
			if(e.getId()==id)
			{
				list.remove(me.getKey());
				return true;
			}
		}*/
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			Connection con = DriverManager.getConnection(url,"sys as sysdba","6684");
			PreparedStatement pst = con.prepareStatement("delete from emp_user where empid=?");
			pst.setInt(1, id);
			pst.executeUpdate();
			System.out.println("Employee deleted from database");
			return true;
		}
		catch(Exception ex)
		{
			return false;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public boolean schemeDetails(String scheme)
	{
		/*Set<Entry<String,Employee>> set = list.entrySet();
		Iterator<Entry<String,Employee>> it = set.iterator();
		while(it.hasNext())
		{
			Map.Entry me = (Map.Entry)it.next();
			e = (Employee)me.getValue();
			if(e.getInsuranceScheme().equalsIgnoreCase(scheme))
			{
				System.out.println("-----------------------------------------");
				System.out.println("Employee id:"+e.getId());
				System.out.println("Employee name:"+e.getName());
				System.out.println("Employee salary:"+e.getSalary());
				System.out.println("Employee designation:"+e.getDesignation());
				System.out.println("-----------------------------------------");
				
			}
			
		}*/
		return false;
		
	}
	
	
	/*@SuppressWarnings("rawtypes")
	public void sortSal()
	{
		Set<Entry<String,Employee>> set = list.entrySet();
		Iterator<Entry<String,Employee>> it = set.iterator();
		ArrayList<Integer> a = new ArrayList<Integer>();
		while(it.hasNext())
		{
			Map.Entry me = (Map.Entry)it.next();
			e = (Employee)me.getValue();
			a.add(e.getSalary());
			Collections.sort(a);
		}
		Map<String,Employee> m = new TreeMap<String,Employee>(list);
		System.out.println("After sorting:");
		Set s2 = m.entrySet();
		Iterator i = s2.iterator();
		while(i.hasNext())
		{
			Map.Entry mee = (Map.Entry)i.next();
			e = (Employee)mee.getValue();
			System.out.println("-----------------------------------------");
			System.out.println("Employee id:"+e.getId());
			System.out.println("Employee name:"+e.getName());
			System.out.println("Employee salary:"+e.getSalary());
			System.out.println("Employee designation:"+e.getDesignation());
			System.out.println("Employee scheme:"+e.getInsuranceScheme());
			System.out.println("-----------------------------------------");
		}
	}*/
	
}
