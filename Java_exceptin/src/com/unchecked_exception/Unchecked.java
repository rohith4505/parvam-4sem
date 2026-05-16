package com.unchecked_exception;

public class Unchecked {
	public static void main(String[] args) {
		System.out.println("program starts");
		int arr[] ={1,2,3,4,5};
		System.out.println("accesing 6th element: ");
		try {
			System.out.println("ele: "+arr[6]);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		System.out.println("program closed");
		
	}

}
