import java.util.Scanner;

class countdigits
{
	public static int Totaldigits(int num)
	{
		int count=0;

		while(num>0)
		{
			num=num/10;
			count++;
		}
		return count;
	}

	public static void main(String []args)	{

	Scanner s = new Scanner(System.in);

	int num=s.nextInt();;
	System.out.println(Totaldigits(num));
	}
}
	
