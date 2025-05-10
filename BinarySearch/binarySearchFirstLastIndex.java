class binarySearchFirstLastIndex
{
	public static void binarySearch(int arr[], int target, boolean isFirstIndex)
	{
		int start=0;
		int end=arr.length-1;
		int mid=0;
		int ans=-1;

		while(start<=end)
		{
			mid=start+ (end-start)/2;

			if(target==arr[mid])
			{
				ans=mid;
				if(isFirstIndex)
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
		if(ans!=-1)
		{
			System.out.println(target+" is Found At : "+ans);
		}
		else
		{
			System.out.println(target+" is Found Not ");
		}
		
	}

	public static void main(String []args)		{

	int arr[]={10,20,30,40,40,40,50,60};
	
	for(int a  : arr)
	{
		System.out.print(a+" ");
	}
		System.out.println();
		binarySearch(arr, 40, false);
	}
}