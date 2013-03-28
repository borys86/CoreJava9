import java.io.Console;
import java.util.Scanner;

public class C009ScannerSample
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter some data, terminate input with [Enter]: ");

		String input = scanner.nextLine();

		System.out.println("you have entered: " + input);

		scanner.close();

		// System.out.println("enter your password: ");

		Console cons;
		char[] passwd;
		if ((cons = System.console()) != null
				&& (passwd = cons.readPassword("[%s]", "Password:")) != null) {
			System.out.println("your password is" + new String(passwd));
			
			java.util.Arrays.fill(passwd, ' ');
		}
		else {
			System.out.println("console object is unavailable");
		}

	}

}
