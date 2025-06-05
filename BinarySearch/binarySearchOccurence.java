class binarySearchOccurence
{
	public static int Occurence(int arr[], int target)
	{
		int firstIndex = binarySearch(arr, target, true);	// Find the first occurrence of the target
		int lastIndex = binarySearch(arr, target, false);	// Find the last occurrence of the target

		if(firstIndex == -1)	// If target not found, return 0
		{
			return 0;
		}
		int occurence = lastIndex - firstIndex + 1;	// Calculate number of occurrences

		return occurence;	// Return the total occurrences
	}

	public static int binarySearch(int arr[], int target, boolean isFirst)
	{
		int start = 0;
		int end = arr.length - 1;
		int ans = -1;	// Default answer if target not found
		int mid = 0;

		while(start <= end)	// Standard binary search loop
		{
			mid = start + (end - start) / 2;	// Calculate the mid index

			if(target == arr[mid])	// If mid element is target
			{
				ans = mid;	// Store current index as potential answer
				if(isFirst)	// If looking for first occurrence
				{
					end = mid - 1;	// Search left half
				}
				else	// If looking for last occurrence
				{
					start = mid + 1;	// Search right half
				}
			}
			else if(target > arr[mid])	// If target is greater, go right
			{
				start = mid + 1;
			}
			else	// If target is smaller, go left
			{
				end = mid - 1;
			}
		}

		return ans;	// Return the index of first/last occurrence or -1
	}

	public static void main(String []args)		
	{
		int arr[] = {10, 20, 30, 40, 50, 50, 50, 60};
		int target = 50;
		System.out.println(Occurence(arr, target));
	}
}
