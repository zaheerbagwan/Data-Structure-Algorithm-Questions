import java.util.Scanner;

class ArmstrongNumber
{
	public void Checker(int num)
	{
		int digits=0;
		int copy=num;
		int result=0;
		while(num>0)
		{
			digits=num%10;
			result=result+digits*digits*digits;
			num=num/10;

		}
	
		System.out.println(copy==result);
	}

	public static void main(String []args)	{
	
	ArmstrongNumber an = new ArmstrongNumber();

	Scanner s = new Scanner(System.in);
	int num=s.nextInt();

	an.Checker(num);
	}
}