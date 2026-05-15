package com.finalkeyword;

import java.util.Arrays;

public class Array3 {
	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0]=12;
		arr[1]=62;
		arr[2]=982;
	System.out.println(arr[4]);	
	System.out.println(Arrays.toString(arr)
			);
	for(int ele : arr) {
		System.out.println(ele);
	}
	}

}
