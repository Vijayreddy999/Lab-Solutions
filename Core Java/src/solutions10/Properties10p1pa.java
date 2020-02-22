package solutions10;
import java.io.*;
import java.util.Properties;

public class Properties10p1pa 
{

	public static void main(String[] args)throws Exception 
	{
		FileReader fr = new FileReader("D:\\Vijay\\Core Java\\Core Java\\src\\solutions10\\PersonProps.properties");
		Properties p = new Properties();
		p.load(fr);
		System.out.println("Values stored in properties are:");
		System.out.println(p);
	}

}
