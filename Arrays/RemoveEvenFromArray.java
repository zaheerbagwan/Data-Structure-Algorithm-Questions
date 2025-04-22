class RemoveEvenFromArray
{
	public static int[] RemoveEven(int[] a)
	{
		int oddcount=0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2!=0)
			{
				oddcount++;
			}
		}

		int result[]= new int[oddcount];

		int dx=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2!=0)
			{
				result[dx]=a[i];
				dx++;
			}	
		}
	
	return result;
	}

	public static void main(String []args)	{
	
	int a[]= {1,2,3,4,5,6,7,8,9,10};

	RemoveEvenFromArray re = new RemoveEvenFromArray();

	int result[]=RemoveEvenFromArray.RemoveEven(a);		

	System.out.print("After removing Even : ");

	for(int i=0; i<result.length; i++)
	{	
		System.out.print(result[i]+" ");
	}

	}
}