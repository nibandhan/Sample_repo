package practice;

public class Reverse {

	public static void main(String[] args) {

		String str ="oppo";
		
		String reverse="";
		
		for(int i=str.length()-1; i>=0;i--)
		{
			reverse = reverse+str.charAt(i);
		
		}
		if(str.equals(reverse))
		{
			System.out.println(reverse);
		}
		else
		{
			System.out.println("not");
		}
		
	}

}
