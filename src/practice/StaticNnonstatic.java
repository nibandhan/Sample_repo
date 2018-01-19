package practice;


class SN
{
	    int c=11;
	    int d=12;
	    
		static int a=10;
		static int b=20;
		   
		final int z=80;
		
		public static void m1()
		{
			System.out.println(a);

			System.out.println(b);
		}
		public void m2()
		{
			System.out.println(c);
			
			System.out.println(d);
			
			System.out.println(z);

		}
}

public class StaticNnonstatic {

	
		
	public static void main(String args[])
	{
		
		SN.m1();
		SN sn = new SN();
		sn.m2();
			
	}


}