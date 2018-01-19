package practice;

public class Constructors {
	
	Constructors()
	{
		
		this(10,"Nibandhan");		
		System.out.println("this is default constructor ");
		
	}
	
	Constructors(int a, String b)
	{
		this(10);
		System.out.println("this is dual parameter constructor"+" "+ a+" and "+b);

	}
	
	Constructors(int a)
	{
		
		System.out.println("this is single parameter constructor"+" "+ a);

	}
	
	
	

	public static void main(String[] args) {
		
		Constructors con= new Constructors();
		
		

	}

}
