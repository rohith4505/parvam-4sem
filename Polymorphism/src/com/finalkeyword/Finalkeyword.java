package com.finalkeyword;
class Parent{
	public void display()
{
		System.out.println("parent method");
		}
}
class child extends Parent{
	@Override
	public void display()
	{
		System.out.println("child method");
	}
}

public class Finalkeyword {
	public static void main(String[] args) {
		final double pi =3.14;
		System.out.println("PI: "+pi);
		
		final int marks;
		marks =234;
	  //  marks =240;
	}

}
