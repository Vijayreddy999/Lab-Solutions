package Solutions3;
import java.text.*;
import java.util.*;
import java.time.*;
public class DateOperations3p3 
{
	void diff()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day of the year:");
		int d = sc.nextInt();
		System.out.println("Enter month of the year:");
		int m = sc.nextInt();
		System.out.println("Enter the year:");
		int y = sc.nextInt();
		LocalDate l = LocalDate.of(y,m,d);
		LocalDate n = LocalDate.now();
		Period p = Period.between(l, n);
		int days = p.getDays();
		int months = p.getMonths();
		int years = p.getYears();
		System.out.println("Difference in days:"+days);
		System.out.println("Difference in months:"+months);
		System.out.println("Difference in years:"+years);
	}
	
	public static void main(String args[])
	{
		DateOperations3p3 dop = new DateOperations3p3();
		dop.diff();
	}
}
