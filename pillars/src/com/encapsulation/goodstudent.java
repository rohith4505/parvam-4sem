package com.encapsulation;

class Student1 {
	public String name;
	public int age;
	public String usn;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUsn() {
		return usn;
	}

	public void setUsn(String usn) {
		this.usn = usn;
	}

	public String toString() {
		return "Student1 [name=" + name + ", age=" + age + ", usn=" + usn + "]";
	}
}

public class goodstudent {

	public static void main(String[] args) {

		Student1 st1 = new Student1();

		st1.setName("ABCD");
		st1.setAge(21);
		st1.setUsn("1CE245AI097");

		System.out.println(st1.getName());
		System.out.println(st1);
	}
}