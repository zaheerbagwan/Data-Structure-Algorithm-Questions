import java.util.Scanner;

class countEvenOdddigits
{
	public static void count(int num)
	{
		int digit;
		int even=0;
		int odd=0;
		while(num>0)
		{
			digit=num%10;
			if(digit%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			num=num/10;

		}
	System.out.println("Even Count : "+even);
	System.out.println("odd Count : "+odd);
	}

	public static void main(String []args)	{

	Scanner s = new Scanner(System.in);
	int num=s.nextInt();
	count(num);
	}
}