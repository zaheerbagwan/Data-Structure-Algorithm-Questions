class ReversingArrayMethod1
{
	public int[] Reverse(int a[],int start, int end)
	{
		int temp=0;
		while(start<end)
		{
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
	return a;
	}


	public static void main(String []args)		{
	int a[]={10,20,30,40,50};

	ReversingArrayMethod1 ra = new ReversingArrayMethod1();
	ra.Reverse(a,0,a.length-1);

	for(int i=0; i<a.length; i++)
	{
		System.out.print(a[i]+" ");
	}

	}
}
