import java.util.Scanner;

class ternarySearch
{
	public static boolean search(int arr[], int target, int n)
	{
		int start = 0; // Initialize the start of the search block
		int end = (int) Math.sqrt(n); // Calculate block size using square root of array size
		int step = end; // Save the block size for consistent jumps
		
		// Keep jumping in blocks while end is within bounds and current value <= target
		while(end < n && arr[end] <= target)
		{
			start = end; // Move the start to the current end
			end = end + step; // Jump ahead by one block
		}

		// Perform a linear search within the identified block
		for(int i = start; i < end; i++)
		{
			if(arr[i] == target) // If target is found, return true
			{
				return true;
			}
		}

		return false; // If not found, return false
	}

	public static void main(String []args)	
	{

	Scanner s = new Scanner(System.in);

	System.out.println("Enter the size of Array : ");
	int n = s.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter the Value in Array : ");
	for(int i = 0; i < n; i++)
	{
		arr[i] = s.nextInt();
	}
	System.out.println("Enter the Target : ");
	int target = s.nextInt();
	System.out.println("Target Status : " + search(arr, target, n));
	}
}
