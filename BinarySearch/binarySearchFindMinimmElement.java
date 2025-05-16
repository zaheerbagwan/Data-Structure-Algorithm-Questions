class binarySearchFindMinimmElement
{
	public static int minimumElement(int arr[])
	{
		int start=0;
		int end=arr.length-1;
		int mid=0;
		int min=Integer.MAX_VALUE;

		while(start<=end)
		{
			mid=start+end-start/2;
			
			if(arr[start]<=arr[mid])
			{
				min=Math.min(arr[start], min);
				start=mid+1;
			}
			else
			{
				min=Math.min(arr[mid], min);
				end=mid-1;
			}
		}
	return min;
	}

	public static void main(String []args)	{

	int arr[]={10,20,40,23,18,1};
	System.out.println(minimumElement(arr));
	}
}