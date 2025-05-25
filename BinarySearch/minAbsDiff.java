class minAbsDiff
{
	public static int binarySearch(int arr[], int target)
	{
		int start=0;
		int end=arr.length-1;
		int mid=0;
		int ans=-1;

		while(start<=end)
		{
			mid=start+(end-start)/2;

			if(target==arr[mid])
			{
				ans=0;
				break;
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
		
		int res=0;
		if(ans==0)
		{
			return ans;
		}
		else if(start==arr.length)
		{
				
			res=Math.abs(target-arr[end]);
		}
		else
		{
			int min1=Math.abs(target-arr[start]);
			int min2=Math.abs(target-arr[end]);
			res=Math.min(min1, min2);
		}
		return res;
	}

	public static void main(String []args)		{

	int arr[]={2,4,8,13,17,22,56};
	System.out.println(binarySearch(arr, 56));
	}
}		