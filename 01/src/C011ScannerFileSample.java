import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class C011ScannerFileSample
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Path path = Paths.get("/home/brz/development/Source/CoreJava9/01/bin/myfile.txt");
		
		String workDir = System.getProperty("user.dir");
		
		System.out.println(workDir);
		
		Scanner in;
		String line;
		
		try {
			in = new Scanner(path);
			
			while (in.hasNext()) {
			
				line = in.nextLine();
				System.out.println(line);
				
			}
			
			in.close();
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
