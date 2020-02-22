package Solutions3;
import java.util.*;
public class StringOperations3p2
{
	static String s;
	
	static boolean isPositive(String s)
	{
		for(int i=1;i<s.length()-1;i++)
		{
			if(s.charAt(i)<s.charAt(i-1))
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		s = sc.nextLine();
		StringOperations3p2 so = new StringOperations3p2();
		if(isPositive(s))
			System.out.println("True");
		else
			System.out.println("False");
	}

}
