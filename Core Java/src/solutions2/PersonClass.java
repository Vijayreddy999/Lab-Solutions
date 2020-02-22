package solutions2;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
 enum Gender
{
	M,F;
}
 
class MyException extends Exception
{
	public MyException(String s)
	{
		super(s);
	}
}

public class PersonClass 
{
	public String fname;
	public String lname;
	Gender gender;
	public String pno;
	int age;
	String fullname;
	
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	PersonClass()
	{
		fname="Maggie";
		lname="Ch";
		gender=Gender.F;
		pno="12345";
	}
	PersonClass(String fname,String lname,Gender gender)
	{
		this.fname=fname;
		this.lname=lname;
		this.gender=gender;
	}
	
	public String getFname()
	{
		
		return fname;
	}
	public void setFname(String fname)
	{
		this.fname = fname;
	}
	
	public String getLname()
	{
		return lname;
	}
	public void setLname(String lname)
	{
		this.lname = lname;
	}
	
	public Gender getGender()
	{
		return gender;
	}
	public void setGender(Gender gender)
	{
		this.gender = gender;
	}
	
	
	void calculateAge()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date of birth in the format dd/mm/yyyy:");
		String s = sc.nextLine();
		DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate l = LocalDate.parse(s, d);
		LocalDate dob = LocalDate.of(l.getYear(),l.getMonthValue(),l.getDayOfMonth());
		LocalDate pre = LocalDate.now();
		Period p = Period.between(dob, pre);
		age = p.getYears();
	}
	
	void display()
	{
		System.out.println("______________________");
		System.out.println();
		System.out.println("First Name:"+getFname());
		System.out.println("Last Name:"+getLname());
		System.out.println("Gender:"+getGender());
		System.out.println("Phone Number:"+getPno());
		System.out.println("Age:"+age);
		System.out.println("Full Name:"+fullname);
	}
	
	public String getFullName()
	{
		try
		{
				if(fname.equals("") && lname.equals(""))
				{
					throw new MyException("First name and Last name is Blank");
				}
				else
				{
					fullname = fname+lname;
					return fullname;
				}
		}
		catch(MyException ex)
		{
			System.out.println(ex.getMessage());
			return null;
		}
	}
	
	
	
	
	public static void main(String[] args)
	{
		PersonClass pc = new PersonClass();
		PersonClass pc1 = new PersonClass("","",Gender.M);
		System.out.println("Person Details");
		pc.setPno("345678");
		pc.calculateAge();
		pc.getFullName();
		pc.display();
		pc1.setPno("673475");
		pc1.calculateAge();
		pc1.getFullName();
		pc1.display();
	}

}
