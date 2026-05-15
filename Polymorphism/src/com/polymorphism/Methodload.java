package com.polymorphism;
class calculation{
	public int add(int a, int b) {
		return a+b;
	}
	public double multiply(double a, double b) {
		return a*b;
	}
}

public class Methodload {
	public static void main(String[] args) {
		calculation c = new calculation();
		int res =c.add(10,20);
		System.out.println("RES:" +res);
		double res1 = c.multiply(10, 20);
		System.out.println("MULTIPLICATION: "+res1);
	}

}
