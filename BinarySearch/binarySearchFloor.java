class binarySearchFloor
{
	public static void returnFloor(int arr[], int target)
	{
		int floor=binarySearchFloor(arr, target);

		System.out.println("The Floor is : "+floor);
		//System.out.println("The Ceil is : "+floor);

	}

	public static int binarySearchFloor(int arr[], int target)
	{
		int start=0;
		int end=arr.length-1;
		int mid;
		int ans=-1;

		while(start<=end)
		{
			mid=start+(end-start)/2;

			if(arr[mid]==target)
			{
				ans=target;
				break;
			}
			else if(target>arr[mid])
			{
				start=mid+1;
				ans=arr[mid];
			}
			else
			{
				end=mid-1;
			}
		}

		return ans;
	}

	public static void main(String []args)		{
	
	int arr[]={10,20,30,40,50,60};
	for(int a : arr)
	{
		System.out.print(a+" ");
	}
	int target=34;
	System.out.print("Target : "+target);
	System.out.println();
	returnFloor(arr, target);
	}
}