package com.training.model;

import com.training.model.CreditCard;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        CreditCard c1=new CreditCard(100, "ram", 1000);
        CreditCardService service=new CreditCardService();
        service.addCard(c1);
        CreditCard[] cards2=service.getCards();
        double total=0;
        for(CreditCard eachCard:cards2) {
        	System.out.println(eachCard);
        	total=total+eachCard.getAmountDue();
        }
        System.out.println(total);
        
    }
}
