package day16;

import java.io.File;

/**
 * @author ageorgiev
 * Program that takes a name from the user at the command line and creates a directory on the desktop.
 * 
 */

public class Exercise2 {
	
	private static String dir=null;
	private static String path = System.getProperty("user.home")+ "/desktop/";
	private static File file;
	
	public static void main (String [] args) {
		
		if (args.length==0) {
			System.out.println("You did not enter a directory name!");
		} else {
		 
		dir = args[0];
		
		System.out.println("You entered: "+dir);
		path = path + dir;
		
		file = new File(path);
		
		file.mkdir();
		
		System.out.println("Directory created - "+ path);
		}
		
	}

}
