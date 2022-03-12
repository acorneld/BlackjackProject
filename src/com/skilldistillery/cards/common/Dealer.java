package com.skilldistillery.cards.common;

public class Dealer extends Player{
	private Deck deck = new Deck();
	
	public Dealer(String name) {
		super(name);
		deck.shuffle();
	}

	public void dealToPlayer(Player player) {
		//TODO logic to receiver card
	}
	
	public void dealToDealer() {
		
	}
	//TODO Dealer to receive card
	
	//TODO Dealer hit
	
	//TODO Dealer stay
}
