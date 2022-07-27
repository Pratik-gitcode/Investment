package Java_Program;

public class rev_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="selenium with java is used for testing";
		String s[]=s1.split(" ");
		
		String rev="";
		
		for(int i=s.length-1;i>=0;i--)
		{
			rev +=s[i]+" ";
		}
		System.out.println(rev);
	}

}
