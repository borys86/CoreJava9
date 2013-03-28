
public class C007StringEqualitySample
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String x = "Hello";
		
		if(x == "Hello")
		{
			System.out.println("probably true");
		}
		
		if(x.substring(0, 3) == "Hel")
		{
			System.out.println("probably false");
		}
		
		

	}

}
