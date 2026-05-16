package com.exception11;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exception_handling {
	public static void main(String[] args)  throws FileNotFoundException{
		//CHECKED EXCEPTION
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.write("hello world !!!! this is world which you don't know.");
		pw.close();
		System.out.println("done and dusted");
		
	}

}
