class ReversingArrayMethod2
{

	public int[] Reverse(int a[])
	{
		int result[]= new int[a.length];
		int pos=0;

		for(int i=a.length-1; i>=0; i--)
		{
			result[pos]=a[i];
			pos++;
		}
	return result;
	}

	public static void main(String []args)		{

	int a[]={10,20,30,40,50};

	ReversingArrayMethod2 rr = new ReversingArrayMethod2();
	int result[]=rr.Reverse(a);

	for(int i=0; i<a.length; i++)
	{
		System.out.print(result[i]+" ");
	}

	}
}