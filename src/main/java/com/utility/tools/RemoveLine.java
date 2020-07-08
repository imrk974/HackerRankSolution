package com.utility.tools;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RemoveLine {

	public static void remove() throws IOException {
		
		File file = new File("C://RK/Testing/utility/File.txt");
		File finalFile = new File("C://RK/Testing/utility/Final.txt");
		
		Scanner sc = new Scanner(file);
		FileWriter fw = new FileWriter(finalFile);
		while(sc.hasNextLine()) {
			String temp = sc.nextLine();
			if (!(temp.startsWith("DROP") || temp.trim().equals("/"))) {
				fw.write(temp);
			} 
			if (temp.endsWith(")") || temp.endsWith("\"")) {
				fw.write(";" + "\n");
			} else {
				fw.write("\n");
			}
		}
		
		sc.close();
		fw.close();
		System.out.println("Final File created");
	}
	
	
	public static void main(String[] args) throws IOException {
		
		remove();
	}

}
