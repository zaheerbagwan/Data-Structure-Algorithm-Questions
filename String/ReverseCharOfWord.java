import java.util.Scanner;

class ReverseCharOfWord
{
	public static void main(String []args)		{

	Scanner s = new Scanner(System.in);
	String str=s.nextLine();

	System.out.println(wordCharReverse(str));
	}


	public static String wordCharReverse(String str)
	{
		char ch[]=str.toCharArray();
		
		int startpointer=0;
		for(int endpointer=0; endpointer<=ch.length; endpointer++)
		{
			if(endpointer==ch.length || ch[endpointer]==' ')
			{
				reverse(ch,startpointer,endpointer-1);
				
				startpointer =endpointer+1;
			}
		}

			String ss = new String(ch);
		return ss;	
	}

	public static void reverse(char[] ch, int startpointer, int endpointer)
	{
		while(startpointer<endpointer)
		{
			char temp=ch[startpointer];
			ch[startpointer]=ch[endpointer];
			ch[endpointer]=temp;
			startpointer++;
			endpointer--;
		}
	}
}