package com.Q3;

public class CardPayment implements Payment{
	
	private int amount;


	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		System.out.println( "Payment done using Card "+amount);
		
	}

	
	

//	@Override
//	public String toString() {
//		return "CardPayment [amount=" + amount + "]";
//	}




	public CardPayment(int amount) {
		this.setAmount(amount);
	}




	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	

}
