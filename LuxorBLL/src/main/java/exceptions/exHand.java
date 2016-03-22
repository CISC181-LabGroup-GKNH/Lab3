package exceptions;

import pokerBase.Hand;

public class exHand extends Exception{
	private Hand handA;
	private Hand handB;
	
	public exHand(Hand handA, Hand handB) {
		super();
		this.handA = handA;
		this.handB = handB;
	}
	
}
