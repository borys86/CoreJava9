
public class C014DoWhileSample
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int x = 10;
		int count = 0;
		
		do{
			System.out.println("X: " + x);
			
			x++;
			count++;
		}
		while (x < 10);
		
		System.out.println(count);

	}

}
