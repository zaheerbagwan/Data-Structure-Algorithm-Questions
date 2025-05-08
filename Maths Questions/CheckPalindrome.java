class CheckPalindrome
{
	public static boolean checkNumber(int num)
	{
		int result=0;
		int digit=0;
		int copy=num;
		while(num>0)
		{
			digit=num%10;
	
			result=result*10+digit;
			num=num/10;
		}
	return copy==result;

	}

	public static void main(String []args)		{

	System.out.println(checkNumber(13421));
	}
}