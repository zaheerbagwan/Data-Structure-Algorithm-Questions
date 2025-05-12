class binarySearchOccurence
{
	public static int  Occurence(int arr[], int target)
	{
		int firstIndex = binarySearch(arr, target, true);
		int lastIndex = binarySearch(arr, target, false);

		if(firstIndex==-1)
		{
			return 0;
		}
		int occurence=lastIndex-firstIndex+1;
		
		
		return occurence;
	}

	public static int binarySearch(int arr[], int target, boolean isFirst)
	{
		int start=0;
		int end=arr.length-1;
		int ans=-1;
		int mid=0;

		while(start<=end)
		{
			mid=start+(end-start)/2;
			if(target==arr[mid])
			{
				ans=mid;
				if(isFirst)
				{
					end=mid-1;
				}
				else
				{
					start=mid+1;
				}
			}
			else if(target>arr[mid])
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}

		return ans;
	}

	public static void main(String []args)		{

	int arr[]={10,20,30,40,50,50,50,60};
	int target=50;
	System.out.println(Occurence(arr, target));
	}
}
		