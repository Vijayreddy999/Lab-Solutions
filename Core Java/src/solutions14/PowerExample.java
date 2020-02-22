package solutions14;
import java.util.*;

@FunctionalInterface
interface PowerFinder
{
	public int power(int x,int y);
}

public class PowerExample
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int x1 = sc.nextInt();
		System.out.println("Enter second number");
		int y1 = sc.nextInt();
		PowerFinder p = (x, y)->(int)Math.pow(x1,y1);
		System.out.println("Power of two numbers is:"+p.power(x1, y1));
		
	}


}
