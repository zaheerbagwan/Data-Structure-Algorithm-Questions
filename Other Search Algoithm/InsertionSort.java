class Insertionsort
{
	public static int[] sort(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			int j=i-1;
			int temp=arr[i];
			
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1]=arr[j];

				j--;

			}

			arr[j+1]=temp;
		}

		return arr;
	}

	public static void main(String []args)	{

	int arr[]={10,2,3,6,7,5,9,4};
	int result[]=sort(arr);

	for(int a : result)
	{
		System.out.print(a+" ");
	}

	}
}

	