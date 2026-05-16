package com.unchecked_exception;

public class Unchecked2 {
	public static void main(String[] args) {
		System.out.println("program starts");
		String s = "murali";
		System.out.println("accesing 7th element: ");
		try {
			System.out.println("ele: "+s.charAt(7));
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		System.out.println("program closed");
		
	}

}
