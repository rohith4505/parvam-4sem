package com.specifiers;
class Privateaccess {

	private String name;
	private int age;
	private double salary;

	public void display() {
		System.out.println("Name   : " + name);
		System.out.println("Age    : " + age);
		System.out.println("Salary : " + salary);
	}

	public static void main(String[] args) {

		Privateaccess p1 = new Privateaccess();

		p1.name = "murali";
		p1.age = 24;
		p1.salary =50000;

		p1.display();
	}
}