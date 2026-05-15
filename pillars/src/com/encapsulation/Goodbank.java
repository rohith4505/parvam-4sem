package com.encapsulation;

class Bankacc2 {
	public String accname;
	public Bankacc2(String accname, int accnum, int bal) {
		super();
		this.accname = accname;
		this.accnum = accnum;
		this.bal = bal;
	}
	public int accnum;
	public int bal;
	
	public int withdraw(int amt) {
		if (amt <=0 || amt>bal) {
			System.out.println("invalid amount");
			return 0;
		}
		else {
			this.bal-=amt;
			return amt;
		}
	}
	public void deposit(int amt) {
		if (amt<=0) {
			System.out.println("amy should be greater");
			return;
		}
		else {
			this.bal+=amt;
		}
	}
	public void Printdetails() {
		System.out.println("acc holder name: " +this.accname);
		System.out.println("acc num: "+this.accnum);
		System.out.println("Balance: "+this.bal);
	}


}

public class Goodbank {

	public static void main(String[] args) {
		Bankacc2 b1 = new Bankacc2("pavan",1234,10000);
		b1.deposit(200);
		int res = b1.withdraw(1000);
		System.out.println("withdraw amt: "+res);
		b1.Printdetails();
	}

		
}