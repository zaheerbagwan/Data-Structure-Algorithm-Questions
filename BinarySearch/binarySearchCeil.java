class binarySearchCeil
{
	public static void returnCeil(int arr[], int target)
	{
		int ceil=ceilFinder(arr, target);
		
		System.out.println("ceil is : "+ceil);
	}

	public static int ceilFinder(int arr[], int target)
	{
		int start=0;
		int mid=0;
		int end=arr.length-1;
		int ans=-1;

		while(start<=end)
		{
			mid=start+(end-start)/2;

			if(target==arr[mid])
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
				ans=arr[mid];
			}
		}
		return ans;
	}

	public static void main(String []args)		{

	int arr[]={10,20,30,40,55,60};
	for(int a : arr)
	{
		System.out.print(a+" ");
	}
	int target=46;
	System.out.print("Target : "+target);
	System.out.println();
	returnCeil(arr,target);
	}
}
	