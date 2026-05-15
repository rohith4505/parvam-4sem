package com.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Arraylist2 {
	public static void main(String[] args) {
		List<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(20);
		arr1.add(40);
		arr1.add(3);
		arr1.add(50);
		int ele = arr1.get(3);
		System.out.println(arr1);
		System.out.println();
		System.out.println(ele);
		arr1.forEach((value)->System.out.println(ele));
		System.out.println(Collections.min(arr1));
		
		
	
		}
}
