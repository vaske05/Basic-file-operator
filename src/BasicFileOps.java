import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BasicFileOps {
	
	int finalNumber=0;
	
	void mainMethod(final File folder) {
		
		for(final File fileEntry : folder.listFiles()) {
			
			if(fileEntry.isFile())
			{
				int number;
				int counter = 0;
				String fileName;
				
				fileName = fileEntry.getName();
				number = Integer.parseInt(fileName.substring(6, 9));
				try
				{
					Scanner scanner = new Scanner(new File(fileEntry.getPath()));
					while(scanner.hasNextLine())
					{
						String line;
						line = null;
						line = scanner.nextLine();
						boolean find = line.contains("PSIML");
						
						if(find == true) {
							counter++;
						}
					}
					if(counter == number)
					{
						finalNumber++;
					}
					
					scanner.close();
				} 
				catch(IOException e) {
					e.printStackTrace();
				}
			}
			if(fileEntry.isDirectory()) {
				mainMethod(fileEntry);
			}
			else{
				
			}
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Enter path to folder:");
		Scanner in = new Scanner(System.in);
		String path = in.nextLine();
		
		final File myFolder = new File(path);
		BasicFileOps bfo = new BasicFileOps();
		bfo.mainMethod(myFolder);
		System.out.println(bfo.finalNumber);
		System.out.println("Developed by:Milan Vasiæ");
		in.close();
	}
}
