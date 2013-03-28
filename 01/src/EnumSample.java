
public class EnumSample
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Enum<Size> mySize = Size.MEDIUM;
				
		System.out.println(mySize.name());
		
		System.out.println(mySize.ordinal());
		
		

	}

}
