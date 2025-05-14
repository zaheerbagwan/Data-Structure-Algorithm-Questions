//Array contains duplicate but sorted values

class sortedRotatedArray2
{
	public static boolean binarySearch(int arr[],int target)
	{
		int start=0;
		int end=arr.length-1;
		boolean ans=false;
		int mid=0;
		
		while(start<=end)
		{
			mid=start+end-start/2;
		
			if(arr[mid]==target)
			{
				return true;
			}
			else if(arr[start]==arr[mid] && arr[end]==arr[mid])
			{
				start++;
				end--;
			}
			else if(arr[start]<=arr[mid])
			{
				if(target>=arr[start]  && target<=arr[mid])
				{
					end=mid-1;
				}
				else
				{
					start=mid+1;
				}
			}
			else
			{
				if(target>=arr[start]  && target<=arr[mid])
				{
					end=mid-1;
				}
				else
				{
					start=mid+1;
				}
			}
		}
		return ans;
	}

	public static void main(String []args)		{

	int arr[]={19,2,19,19,19,19};
	int target=2;
	System.out.println("If value found it will return true or if not then False");

	System.out.println(binarySearch(arr,target));
	}
}		