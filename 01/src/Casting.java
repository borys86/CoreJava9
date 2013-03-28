
public class Casting
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		double x = 9.7997;
		int y = (int) x;
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		double z = Math.round(x);
		
		System.out.println("z: " + z);
		
		int w = (int)z;
		
		System.out.println("w: " + w);
		

	}
}
