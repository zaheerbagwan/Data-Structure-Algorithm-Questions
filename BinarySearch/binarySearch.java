class binarySearch
{
	public static void binarySearchProgram(int arr[], int target)
	{
		int start=0;
		int mid=0;
		int end=arr.length-1;
		int ans=-1;
		while(start<=end)
		{
			mid=start+(end-start/2);
			
			if(arr[mid]==target)
			{
				ans=mid;
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
		if(ans==-1)
		{
		System.out.println(target+" is found Not Found");
		}
		else
		{
			System.out.println(target+" is found At "+ans);
		}
	}


	public static void main(String[] args)		{

	int arr[] = {10,20,44,50,60};
	for(int aa : arr)
	{
		System.out.print(aa+" ");
	}
	
	System.out.println();	
	binarySearchProgram(arr,60);
	}
}
	
				