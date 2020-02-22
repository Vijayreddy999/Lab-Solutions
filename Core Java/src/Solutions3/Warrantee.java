package Lab3;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Warrantee {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the produt purchase date in the "+"dd/mm/yyyy"+"format");
		String t=sc.nextLine();
		//SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yy");
		Date currentDate =new SimpleDateFormat("dd/MM/yyyy").parse(t);
		//String date = formatter.format(currentDate);
		//Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(date);
		System.out.println(currentDate);
		System.out.println("enter the total no. of  MoNTHs of expire");
		int m=sc.nextInt();
		//int y=sc.nextInt();
		System.out.println(addMonth(currentDate,m));
	 }
	/*public static Date addDay(Date date, int i) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_YEAR, i);
        return cal.getTime();
    }*/
    public static Date addMonth(Date date, int i) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, i);
        return cal.getTime();
    }/*
    public static Date addYear(Date date, int i) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR, i);
        return cal.getTime();
    }*/

	}


