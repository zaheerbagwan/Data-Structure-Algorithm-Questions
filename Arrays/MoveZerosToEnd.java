class MoveZerosToEnd
{	
	public int[] ZeroMover(int a[])
	{
		int temp=0;
		int j=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]!=0 && a[j]==0)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}

			if(a[j]!=0)
			{
				j++;
			}
		}
		return a; 
	}

	public static void main(String []args)	{

	int a[] = {10,0, 20, 30, 0, 40, 50};	

	MoveZerosToEnd mz = new MoveZerosToEnd();
	mz.ZeroMover(a);

	for(int i=0; i<a.length; i++)
	{
		System.out.print(a[i]+" ");
	}

	}
}
				