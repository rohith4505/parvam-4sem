package com.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readfile {
public static void main(String[] args) throws FileNotFoundException , IOException{
	System.out.println("starting");
	try(BufferedReader br = new BufferedReader(new FileReader("sample.txt"))){
			String line;
			int linenum = 1;
			while((line = br.readLine()) !=null){
				System.out.println("nline: " +linenum+" : "+line);
				linenum++;
			}
	
	}
}
}
