package com.input_scanner;

import java.util.Scanner;

public class scanner_class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks:");
		int marks = sc.nextInt();
		System.out.println("your marks is: "+marks);
		Scanner name = new Scanner(System.in);
		System.out.println("enter the name: ");
		String nam = sc.next();
		System.out.println("the name: "+nam);
		}

}