package com.encapsulation;
class Student{
	public String name;
	public int age;
	public String usn;
	public String toString() {
		return "Student [name=" + name + ",age = "+ age +",usn= " + usn +"]";
	}
}

public class badstudent {
	public static void main(String[] args) {
			Student st1 = new Student();
			st1.name = "rohith";
			st1.age = -20;
			st1.usn ="1ce24ai067";
			System.out.println(st1);
	}

}
