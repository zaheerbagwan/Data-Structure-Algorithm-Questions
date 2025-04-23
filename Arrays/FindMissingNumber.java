class FindMissingNumber
{
	public int FindingMachine(int a[])
	{
		int n=a.length+1;
		int sum=n*(n+1)/2;

		for(int ab : a)
		{
		 	sum=sum-ab;
		}
	return sum;
	}


	public static void main(String []args)		{

	int a[]={2,5,1,7,4,8,6};
	FindMissingNumber fm = new FindMissingNumber();
	int result=fm.FindingMachine(a);

	System.out.println(result);
	}
}
		