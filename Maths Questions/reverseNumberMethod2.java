import java.util.Scanner;

class reverseNumberMethod2
{
	public static void main(String []args)		{

	Scanner s = new Scanner(System.in);
	int num=s.nextInt();

	StringBuffer ss = new StringBuffer(String.valueOf(num));
	StringBuffer sb=ss.reverse();
	
	System.out.println(sb);
	}
}