class ternarySearch
{
	public static void main(String []args)	{

	int arr[]={12,34,55,66,78,79};

	//int target=78;
	int target=12;

	int index=searchEngine(arr, target);
	if(index==-1)
	{
		System.out.println("Element Not Found");
		return;
	}
	System.out.println("Element found at : "+index);

	}

	public static int searchEngine(int arr[], int target)
	{
		int start=0;
		int end=arr.length-1;
		int ans=-1;
		int mid1=0;
		int mid2=0;
		while(start<=end)
		{
			mid1=start+end-start/3;
			mid2=end-end-start/3;
		if(target>=arr[start] && target<=arr[mid1])
		{
			if(arr[mid1]==target)
			{
				return mid1;
			}
			else
			{
				end=mid1-1;
			}
		}
		else if(target>arr[mid1] && target<=arr[mid2])
		{
			if(arr[mid2]==target)
			{
				return mid2;
			}
			else
			{
				start=mid2+1;
			}
		}
		else
		{
			start=mid2+1;
		}
	}

	return ans;
	}

}
