import java.util.Scanner;

class DuplicateArrayCounting
{
	public static void main(String []args)	{

	Scanner s = new Scanner(System.in);

	int arr[]= new int[10];

	System.out.println("Enter the Values in Array : ");	

	for(int i=0; i<arr.length; i++)
	{
		arr[i]=s.nextInt();
	}

	System.out.println();

	int count=0;

	System.out.println("Duplicate Values Are : ");

	for(int i=0; i<arr.length; i++)
	{
		for(int j=i+1; j<arr.length; j++)
		{
			if(arr[i]==arr[j])
			{
				System.out.print(arr[i]+" ");
				count++;
			}
		}
	}
	
		System.out.println("There Are "+count+" duplicate values are present");

	}
}