class ShashwatTask1
{
	public static void main(String []args)		{

	String email="Zaheerbagwan043@gmail.com";

	String []remail=email.split("@");
	int startPoint=remail[1].indexOf("g");
	int endPoint=remail[1].indexOf(".");
	System.out.println(remail[1].substring(startPoint, endPoint));
	//System.out.println(remail[1]);
	}
}