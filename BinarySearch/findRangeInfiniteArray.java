//the predefined array is just for example and this question can be ask in interview so thats why it is need to be cover
//our array is finite so can be give indexOutOFBoundException

class findRangeInfiniteArray
{
	public static void range(int arr[], int target)
	{
		int result[]=findRangeOfTarget(arr, target);

		System.out.println(target+" lies between "+result[0]+" to "+result[1]);
		binarySearch(arr, result, target);
		
	}

	public static int[] findRangeOfTarget(int arr[], int target)
	{
		int start=0;
		int end=1;
		int result[] = new int[2]; 
		while(target>=arr[end])
		{
			start=end;
			end=2*end;
		
		}
		result[0]=start;
		result[1]=end;
	return result;
	}

	public static void binarySearch(int arr[], int result[], int target)
	{
		int start=result[0];
		int end=result[1];

		int mid=0;
		int ans=-1;
		int index=0;
		while(start<=end)
		{
			mid=start+(end-start)/2;
	
			if(arr[mid]==target)
			{
				ans=arr[mid];
				index=mid;
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
			System.out.println("Target  Not Found");
		}
		else
		{
			System.out.println(ans+" is Found At "+index);
		}
	}
	
	public static void main(String []args)	{
	
	int arr[]={2,4,4,6,10,15,18,22,26,29,30};
	for(int a : arr)
	{
		System.out.print(a+" ");
	}
	System.out.println();
	range(arr, 19);
	}
}	