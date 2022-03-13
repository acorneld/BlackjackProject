package com.skilldistillery.cards.common;

import java.util.List;

public class Dealer extends Player{
	
	private Deck deck = new Deck();
	private Card dealerHand;
	
	
	
	public Dealer(String name) {
		super(name);
		deck.shuffle();
	}

	public void showHand() {
		System.out.println(getPlayerHand().toString());
	}
	
	public void showHandScore(List<Card> hand, int value) {
		for(Card card : hand) {
			System.out.println(card);
		}
	//	String playerScore = getPlayerHand(
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
