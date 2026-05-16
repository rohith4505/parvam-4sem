package com.exception11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exception_handling3 {
	public static void main(String[] args) {
		File f = new File("abc.txt");
		Scanner sc = null;
		try {
		sc = new Scanner(f);
		while(sc.hasNextLine()) {
			System.out.print(sc.next());
		}
		
		}
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println();
			System.out.println("FAHHHHHH!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			sc.close();
		}
	}
	
}