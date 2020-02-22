package solutions2;
public class PersonDetails 
{
	String fname = "Vj";
	String lname = "Reddy";
	char gender = 'M';
	int age = 21;
	double weight = 81.77;
	
	public static void main(String[] args) 
	{
		PersonDetails pd = new PersonDetails();
		System.out.println("Person Details:");
		System.out.println("______________________");
		System.out.println();
		System.out.println("First Name:"+pd.fname);
		System.out.println("Last Name:"+pd.lname);
		System.out.println("Gender:"+pd.gender);
		System.out.println("Age:"+pd.age);
		System.out.println("Weight:"+pd.weight);
	}

}
