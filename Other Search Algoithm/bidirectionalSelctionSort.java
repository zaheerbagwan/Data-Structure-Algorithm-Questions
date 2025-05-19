class bidirectionalSelctionSort
{
	public static void sort(int arr[] ,int n)
	{
		int k=n-1;
		
		for(int i=0; i<k; i++)
		{
			int maxi=i;
			int maxe=arr[i];
			int mine=arr[i];
			int mini=i;
			for(int j=i+1; j<=k; j++)
			{
				if(arr[j]<maxe)
				{
					mine=arr[j];
					mini=j;
				}
				else if(arr[j]>maxe)
				{
					maxe=arr[j];
					maxi=j;
				}
			}

			swap(arr, i, mini);
			if(arr[mini]==maxe)
			{
				swap(arr, k, mini);
			}
			else
			{
				swap(arr, k, maxi);
			}
			k--;
		}
	}

	public static void swap(int arr[], int index1, int index2)
	{
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
	}

	public static void main(String []args)		{

	int arr[]={1,4,3,7,8,5,2,6};
	System.out.println("Original Array : ");
	for(int a : arr)
	{
		System.out.print(a+" ");
	}
	

	int n=arr.length;
	System.out.println();
	sort(arr, n);
	System.out.println("Sorted Array : ");
	for(int a : arr)
	{
		System.out.print(a+" ");
	}
	
	}
}	
			