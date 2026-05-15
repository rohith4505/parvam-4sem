package com.polymorphism;
class upipayment implements Upi1{
	@Override
	public void ptype() {
		System.out.println("payment type is upi");
	}
}
class Creditcard implements Upi1{
	@Override
	public void ptype() {
		System.out.println("PAYMENT TYPE IS CREDIT CARD");
	}
}

public class Upi {

}
