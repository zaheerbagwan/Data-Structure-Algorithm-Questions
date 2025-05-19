import java.util.Scanner;

class nthPrimeNumbers
{
	public static void printer(int n)
	{
		int count=0;
		int num=2;
		while(count<n)
		{
			if(isprime(num))
			{
				System.out.print(num+" ");
				count++;
			}
			num++;
		}
	}

	public static boolean isprime(int num)
	{
		for(int i=2; i<=Math.sqrt(num); i++)
		{
			if(num%i==0)
			{
				return false;
			}
			
		}
		return true;
	}
			


	public static void main(String []args)	{

	Scanner s = new Scanner(System.in);

	int n=s.nextInt();

	printer(n);
	}
}