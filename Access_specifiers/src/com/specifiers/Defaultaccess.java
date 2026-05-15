package com.specifiers;

class Defaultaccess {

	String name;   // default access
	int age;       // default access
	double salary; // default access

	void display() {  // default method
		System.out.println("Name   : " + name);
		System.out.println("Age    : " + age);
		System.out.println("Salary : " + salary);
	}

	public static void main(String[] args) {

		Defaultaccess d1 = new Defaultaccess();

		d1.name = "John";
		d1.age = 25;
		d1.salary = 45000.50;

		d1.display();
	}
}