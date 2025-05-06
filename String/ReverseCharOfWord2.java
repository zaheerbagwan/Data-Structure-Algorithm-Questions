import java.util.Scanner;

class ReverseCharOfWord2
{
	public static String charReverser(String str)
	{
		String arr[]=str.split(" ");
		
		StringBuilder result = new StringBuilder();
		
		for(String ss : arr)
		{
			StringBuilder iskoreverse = new StringBuilder(ss);
			result.append(iskoreverse.reverse()).append(" ");
		}

	return result.toString().trim();
	}

	public static void main(String []args)		{

	Scanner s = new Scanner(System.in);
	
	String str=s.nextLine();
	System.out.println(charReverser(str));
	}
}
	