package com.training;

import com.training.model.CreditCard;

public class CreditCardService {
	

	CreditCard[] cards=new CreditCard[5];
	int i=0;
	public boolean addCard(CreditCard card) {
	
		boolean flag=false;
		if(i<5) {
		cards[i]=card;
		i++;
		flag=true;
		}
		return flag;		
	}
	public CreditCard[] getCards() {
		return cards;
	}
}
	
	
