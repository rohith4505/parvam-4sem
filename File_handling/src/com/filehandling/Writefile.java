package com.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writefile {
	public static void main(String[] args) throws IOException {
		// ==> file writer
		// ==> buffer writer
//		FileWriter filewriter = new FileWriter("sample.txt");
//		filewriter.write("hello world");
//		filewriter.write("this is java programming");
//		filewriter.write("this is the end");
//		System.out.println("COMPLETED");
//		
//		
//		
		BufferedWriter bufferwriter = new BufferedWriter(new FileWriter("sample.txt"));
	     bufferwriter.write("hello world");
	     bufferwriter.write("this is java programming");
	     bufferwriter.write("\n");
	     bufferwriter.write("rohith gagana");
	     bufferwriter.close();
		System.out.println("COMPLETED");

//		
	}

 
}
