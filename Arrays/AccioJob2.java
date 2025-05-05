import java.util.Arrays;
import java.util.Scanner;

class AccioJob2
{
	public static int LastIndex(int arr[], int target)
	{
		int last=0;	
		int i=0;
		while(i<arr.length)
		{
			if(arr[i]==target)
			{
				last=i;
			}
			i++;
		}
		if(last>0)
		{
			return last;
		}
		return -1;
	}

	public static void main(String []args)		{

	Scanner s = new Scanner(System.in);

	System.out.print("Enter the Size Of Array : ");
	int n=s.nextInt();

	int ab[]= new int[n];

	System.out.println("Enter the value in array : ");

	for(int i=0; i<n; i++)
	{
		ab[i]=s.nextInt();
	}
	
	System.out.println("Enter Target Value : ");
	int target=s.nextInt();
	System.out.println("LastIndex is : "+LastIndex(ab, target));
	}
}