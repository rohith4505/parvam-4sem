package com.exception11;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exception_handling2 {
	public static void main(String[] args) {
		PrintWriter pw = null;
		// CHECKED EXCEPTION

		try {
			pw = new PrintWriter("meow.txt");
			pw.write("hello meow fahhhhhh:::::::::::::::");
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println("file not found" + e.getMessage());
			System.out.println(e);

		} finally {
			pw.close();
			System.out.println("good bye");
		}
	}
}