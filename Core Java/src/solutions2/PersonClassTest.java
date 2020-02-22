package solutions2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonClassTest 
{

	@Test
	public void testGetPno() 
	{
		PersonClass p = new PersonClass("Vj","Reddy",Gender.M);
		p.setPno("12345");
		assertEquals("12345",p.getPno());
	}
	
	@Test
	public void testGetFname()
	{
		PersonClass p = new PersonClass("Vj","Reddy",Gender.M);
		assertEquals("Vj",p.getFname());
	}
	
	@Test
	public void testGetLname()
	{
		PersonClass p = new PersonClass("Vj","Reddy",Gender.M);
		assertEquals("Reddy",p.getLname());
	}
	
	@Test
	public void testGetFullName()
	{
		PersonClass p = new PersonClass("Vj","Reddy",Gender.M);
		assertEquals("VjReddy",p.getFullName());
	}
	
	
	@Test
	public void testGetGender()
	{
		PersonClass p = new PersonClass("Vj","Reddy",Gender.M);
		assertEquals("M",p.getGender().toString());
	}
	
}
