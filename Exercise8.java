package day16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author ageorgiev
 *Program that reads a file from disk in CSV with every line containing numbers separated by commas. 
 *The program outputs average for each line and whole file
 *
 */

public class Exercise8 {

	final private static String DIR = System.getProperty("user.home") + "/desktop/"; 
	private static String fileName = DIR + "/data.csv";
	
	public static void main(String[] args) {
		
			Scanner sc;
		
				try {
					sc = new Scanner (new FileReader(fileName));
					sc.useDelimiter(",");
					String str = sc.next();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

}

