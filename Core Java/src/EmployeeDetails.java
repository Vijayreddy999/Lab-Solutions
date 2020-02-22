
public class EmployeeDetails 
{
	int empid;
	String empname;
	float empsal;
	
	public EmployeeDetails()
	{
		
	}
	public EmployeeDetails(int empid,String empname,float empsal)
	{
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
	}
	
	public void calSal()
	{
		System.out.println("Employee salary:"+(empsal+2000));
	}
	
	public static void main(String[] args) 
	{
		EmployeeDetails ed = new EmployeeDetails();
		ed.calSal();
	}
}
