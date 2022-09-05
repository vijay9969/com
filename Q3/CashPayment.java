package com.Q3;

public class CashPayment implements Payment{
	
	private int amount;


	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		
		System.out.println("Payment done using Cash "+amount);
		
	}
	
//	@Override
//	public String toString() {
//		return "CashPayment [amount=" + amount + "]";
//	}

	public CashPayment(int amount) {
		// TODO Auto-generated constructor stub
		this.setAmount(amount);
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}
	

}
