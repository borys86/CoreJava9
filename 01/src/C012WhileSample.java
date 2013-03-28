
public class C012WhileSample
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int x = 1;
		int count = 0;
		
		while (x < 10) {
			System.out.println("X: " + x);
			
			x++;
			count++;
		}
		
		System.out.println(count);

	}

}
