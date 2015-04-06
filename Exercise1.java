package day16;

import java.io.File;

public class Exercise1 {
	
	private final static String PATH = System.getProperty("user.home")+ File.separator +"desktop";

	public static void main(String[] args) {

		File directory = new File (PATH);
		
		String [] fileArray = directory.list();
		
		for (String s: fileArray) {
			System.out.println(s);
		}
	 
		
		
	}

}
