package Java_Program;

public class ReverseName {
	public static void main(String[] args)   //  main   cntr+space
	{
		
		String s1="Octane";
		String Rev=" ";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
		
			Rev=Rev+s1.charAt(i);
			
		}
		System.out.println(Rev);    //syso cntr+space
	}

}
