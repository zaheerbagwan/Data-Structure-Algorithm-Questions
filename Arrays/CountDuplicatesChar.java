class CountDuplicatesChar
{
	public int Counter(String word)
	{
		int count=0;
		char[] ch=word.toCharArray();

	for(int i=0; i<ch.length; i++)
	{
		for(int j=i+1; j<ch.length; j++)
		{
			if(ch[i]==ch[j])
			{
				count++;
			}
		}
	}

	return count/2;
	}

	public static void main(String[] args)		{

	CountDuplicatesChar cd = new CountDuplicatesChar();
	String word="aabababb";

	
	int result=cd.Counter(word);

	System.out.println("There Are "+result+" duplicate values");
	}
}		