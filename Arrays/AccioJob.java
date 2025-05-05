import java.util.Scanner;

class AccioJob
{
	public static int LastIndex(int arr[], int target)
	{
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==target)
			{
				for(int j=i+1; j<arr.length; j++)
				{
					if(arr[j]==target)
					{
						return j;
						
					}
				}
			return i;
			}
			
		}

		return -1;
	}

	public static void main(String []args)		{

	AccioJob aj = new AccioJob();
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
	System.out.println(LastIndex(ab, target));
	}
}