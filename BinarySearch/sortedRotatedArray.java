class sortedRotatedArray
{
	public static int binarySearch(int arr[], int target)
	{
		int start=0;
		int end=arr.length-1;
		int mid=0;
		int ans=-1;

		while(start<=end)
		{
			mid=start+end-start/2;

			if(arr[mid]==target)
			{
				return mid;
			}
			else if(arr[start]<=arr[mid])
			{
				if(target<=arr[start])
				{
					start=mid+1;
				}
				else
				{
					end=mid-1;
				}
			}
			else
			{
				if(target<=arr[start])
				{
					start=mid+1;
				}
				else
				{
					end=mid-1;
				}
			}
		}
	return ans;
	}

	public static void main(String []args)	{

	int arr[]={10,12,40,50,0,1,2};
	int target=34;
	System.out.println("If Element present then it will return index or -1");
	System.out.println(binarySearch(arr, target));
	}
}