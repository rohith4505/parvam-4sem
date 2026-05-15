package com.specifiers;

class Publicaccess {

	public String name;
	public int age;
	public double salary;

	public void display() {
		System.out.println("Name   : " + name);
		System.out.println("Age    : " + age);
		System.out.println("Salary : " + salary);
	}

	public static void main(String[] args) {

		Publicaccess p1 = new Publicaccess();

		p1.name = "raja";
		p1.age = 34;
		p1.salary = 500000;

		p1.display();
	}
}