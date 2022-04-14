package com.training.model;

public class CreditCard {

	private double cardNumber;
	private String cardHolderName;
	private int amountDue;
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreditCard(double cardNumber, String cardHolderName, int amountDue) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.amountDue = amountDue;
	}
	public double getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(double cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public int getAmountDue() {
		return amountDue;
	}
	public void setAmountDue(int amountDue) {
		this.amountDue = amountDue;
	}
	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + ", cardHolderName=" + cardHolderName + ", amountDue="
				+ amountDue + "]";
	}
	
}
