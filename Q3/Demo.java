package com.Q3;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	



	public static void doTransactions(List<?> list) {
		for(int i=0;i<list.size();i++) {
			try {
			CardPayment card = (CardPayment) list.get(i);
			card.doPayment();
			}catch (ClassCastException c) {
				// TODO: handle exception
				CashPayment cash = (CashPayment) list.get(i);
				cash.doPayment();
			}
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		List<CardPayment> card = new ArrayList<>();
		card.add(new CardPayment(8000));
		card.add(new CardPayment(7000));
		
		doTransactions(card);

		List<CashPayment> cash = new ArrayList<>();
		cash.add(new CashPayment(6000));
		cash.add(new CashPayment(9000));
		doTransactions(cash);
	}

}
