package solutions2;


public class PersonMain 
{
	public static void main(String[] args) 
	{
		PersonClass pc = new PersonClass();
		PersonClass pc1 = new PersonClass("Vj","Reddy",Gender.M);
		System.out.println("Person Details");
		System.out.println("______________________");
		System.out.println();
		System.out.println("First Name:"+pc.getFname());
		System.out.println("Last Name:"+pc.getLname());
		System.out.println("Gender:"+pc.getGender());
		System.out.println("______________________");
		System.out.println();
		System.out.println("First Name:"+pc1.getFname());
		System.out.println("Last Name:"+pc1.getLname());
		System.out.println("Gender:"+pc1.getGender());
	}

}
