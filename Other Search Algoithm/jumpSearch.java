class jumpSearch
{
	public static int serachElement(int arr[], int target)
	{
		int start=0;
		int n=arr.length;
		int blocksize=Math.sqrt(n);
		int end=blocksize;
		int ans=-1;
		
		while(arr[start]<target)
		{
			start=end;
			end=end+blocksize;
			
			if(end>blockize)
			{
				end=n;
			}
		}
		
		for(int i=start; i<end; i++)
		{
			if(arr[start]==target)
			{
				return start;
			}
		}
	}

	public static void main(String []args)	{

	int arr[]={10,18,19,49,60,68};
	int target=49;
	int result=searchElement(arr, target);
	if(result==-1)
	{
		System.out.println("Element Not Found");
	}
	else
	{
		System.out.println("Element Found At : "+result);
	}

	}
}
