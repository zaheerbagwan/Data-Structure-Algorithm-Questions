class arrays3
{
	public static void main(String []args)	{
	
	String cars[]=new String[5];

	cars[0]="Bugatti";
	cars[1]="Audi";
	cars[2]="BMW";
	cars[3]="Ferarri";
	cars[4]="TOYOTA";

	for(int i=0; i<cars.length; i++)			//here's the car is array
	{
		System.out.println(cars[i]);		// and ' i '  is no of arrays
	}

	}
}