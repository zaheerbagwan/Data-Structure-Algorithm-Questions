import java.util.Scanner;

class checkPrime
{
	public static void main(String []args)	{

	Scanner s = new Scanner(System.in);
	int num=s.nextInt();
	int count=0;
	
	for(int i=1; i<=num; i++)
	{
		if(num%i==0)
		{
			count++;
		}
	}

	if(count==2)
	{
		System.out.println(num+" is A Prime Number");
	}
	else
	{
		System.out.println(num+" is Not A Prime Number");
	}

	}
}