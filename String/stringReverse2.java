class stringReverse2
{
	public static void reverseMachine(String str)
	{
		String ans="";
		int n=str.length();
		for(int i=0; i<n; i++)
		{
			ans=str.charAt(i)+ans;
		}

		System.out.println(ans);
	}

	public static void main(String []args)		{


	stringReverse2 sr = new stringReverse2();
	String str="BAGWAN";
	sr.reverseMachine(str);
	}
}