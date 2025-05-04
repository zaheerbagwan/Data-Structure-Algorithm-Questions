import java.util.Scanner;

class stringReverse
{
	public static void main(String []args)		{

	Scanner s = new Scanner(System.in);

	String str=s.next();
		
	ReverseMachine(str);
	}

	public static void ReverseMachine(String str)
	{
		char[] ch=str.toCharArray();
		for(int i=ch.length-1; i>=0; i--)
		{
			System.out.print(ch[i]+" ");
		}
	}

}