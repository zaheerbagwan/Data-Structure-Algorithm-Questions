class binarySearchAbsoluteDiff
{
	public static void absoluteDifference(int arr[], int target)
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
				ans=arr[mid];
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
		if(ans==-1)
		{
			if(end==-1)
			{
				res=Math.abs(target-arr[start]);
			}
			else if(start==arr.length)
			{
				res=Math.abs(target-arr[end]);
			}
			else
			{
				int ans1=Math.abs(target-arr[start]);
				int ans2=Math.abs(target-arr[end]);
				res=(ans1<ans2)?ans1:ans2;
			}
		}

		System.out.println("Minimum Absolute Difference : "+res);
	}

	public static void main(String []args)		{

	int arr[]={10,20,30,40,50,60};

	int target=31;
	absoluteDifference(arr,target);
	}
}