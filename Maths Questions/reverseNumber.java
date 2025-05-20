import java.util.Scanner;

class reverseNumber
{
	public static void reverser(int num)
	{
		int rev=0;
		while(num>0)
		{
			
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse is : "+rev);
	}


	public static void main(String []args)	{

	Scanner s = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int num=s.nextInt();
	System.out.println();
	reverser(num);
	}
}

	