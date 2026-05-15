package com.specifiers;

class ProtectedAccess {

	protected String name;
	protected int age;
	protected double salary;

	public void display() {
		System.out.println("Name   : " + name);
		System.out.println("Age    : " + age);
		System.out.println("Salary : " + salary);
	}

	public static void main(String[] args) {

		ProtectedAccess p1 = new ProtectedAccess();

		p1.name = "pradeep";
		p1.age = 30;
		p1.salary = 90000;

		p1.display();
	}
}