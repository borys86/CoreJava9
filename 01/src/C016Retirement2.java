import java.util.Scanner;


public class C016Retirement2
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("How much monet will you contribute each year? : ");
		
		double payment = in.nextDouble();
		
		System.out.println("Interest rate in %: ");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		
		int year = 0;
		
		String input;
		
		do {
			
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			
			year++;
			
			System.out.printf("After year %d, your balance is %,.2f%n", year, balance);
			
			input = in.next();
			
		} while (input.equals("N"));

	}

}
