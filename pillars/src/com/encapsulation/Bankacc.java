package com.encapsulation;

class Bankacc1 {
	public String accname;
	public int accnum;
	public int bal;

	public String toString() {
		return "bankacc [accname = " + accname + ",accnum = " + accnum + ",bal = " + bal + "]";
	}
}

public class Bankacc {

	public static void main(String[] args) {

		Bankacc1 b1 = new Bankacc1();

		b1.accname = "mohan";
		b1.accnum = 12345;
		b1.bal = 2500;

		System.out.println(b1);
	}
}