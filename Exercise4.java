package day16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author ageorgiev
 *The program takes two names from the user at the command line. If a file with the first name exists, the program
 *copies it into a file with the second name
 *If the first file does not exist, the program says so. If the second file exists, the program asks the user 
 *whether to overwrite it or not, and act accordingly
 *
 */

public class Exercise4 {

		private final static String DIR = System.getProperty("user.home")+ "/desktop/";
		private static String fileName1 = DIR; // initialised to DIR but will be completed with user specified name
		private static String fileName2 = DIR; //initialised to DIR but will be completed with user specified name
		private static File file1 = null;
		private static File file2= null;
		
	public static void main(String[] args) {
		
		
		 //the following checks whether the two file names are specified and concatenates them to fileName1 and fileName2
		
	
		if (args[0]!=null) {
			fileName1 = DIR + args[0];
		} else {
			System.out.println("No file1 name specified!");
		}
		if (args [1]!=null) {
			fileName2 = DIR + args[1];
		} else {
			System.out.println("No file2 name specified!");
		}
		
		// Create instances of the files
		file1 = new File (fileName1);
		file2 = new File (fileName2);
		
		// if - else statements to check if they exist. 
		
		if (file1.exists()){
			
			if (file2.exists()) { // 
				System.out.println(args[1]+ " exists. Type 0 if you wish to abort. Type anything else to continue");
				Scanner sc = new Scanner (System.in);
				int input = sc.nextInt();
				if (input == 0) return; // abort if 0
			
				try {
					FileReader fr = new FileReader (file1);
					BufferedReader br = new BufferedReader (fr);
					FileWriter fw = new FileWriter (file2);
					BufferedWriter bw = new BufferedWriter(fw);
					String s;
					
					while ((s = br.readLine())!= null ) {
						bw.write(s);
					}
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} else {
			System.out.println(args[0]+ " does not exist!");
		}
	}//end of main
}

