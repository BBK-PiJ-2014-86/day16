package day16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author ageorgiev
 * Program that takes a name from the user at the command line. If a file with that name exists, the program must
 * show its contents on the screen. If it does not,, the program must say so.
 * @param args
 */


public class Exercise3 {
	
	private static String directory = System.getProperty("user.home") + "/desktop/";
	private static File file=null;
	
	public static void main(String[] args) {

		/*
		 * 1. Create directory string var 
		 * 2. add the args[0] to the directory string
		 * 3. create file variable and initialise with directory 
		 * 4. file.exists();
		 * 5. if no - sysout message
		 * 6. if yes - wrap file within FileReader. Wrap FileReader within BufferedReader
		 * 7. Read contents and display on screen
		 */
		
		directory += args[0];
		file = new File(directory);
		
		if (!file.exists()) {
			System.out.println("File does not exist");
		} else {
			try {
				FileReader fl = new FileReader(file);
				BufferedReader br = new BufferedReader(fl);
				String s;
				
					while ((s=br.readLine())!=null) {
						
						System.out.println(s);
			
					}
					br.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
			}
			
		}

	}

}
