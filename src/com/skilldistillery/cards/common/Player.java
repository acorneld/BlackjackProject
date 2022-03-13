package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private String name;
	private int numOfCards = 0;
	private List <Card> playerHand;
	
	public Player(String name) {
		this.name = name;
		playerHand = new ArrayList<Card>();
		this.handEmpty();
	}
	// needed a "hand" to put card in
	
	public void handEmpty() {
		for(int i = 0; i < playerHand.size(); i++) {
			this.playerHand = null;
		}
	}
	
	
	//TODO Add card method, need boolean?
	public boolean addCard(Card card) {
		int playerScore = 0;
		Deck deck = new Deck();
		for(int i = 0; i < playerHand.size(); i++) {
			Card cardDealt = deck.dealCard();
			playerScore = playerScore + cardDealt.getValue();
			playerHand.add(cardDealt);
			
		}
			return (playerScore <= 21);
	}
	
	public void showHand() {
		
	}
	
	//TODO 
	// Start G&S ****************************************
	public String getName() {
		return name;
	}

	

	public int getNumOfCards() {
		return numOfCards;
	}

	public void setNumOfCards(int numOfCards) {
		this.numOfCards = numOfCards;
	}

	public List<Card> getPlayerHand() {
		return playerHand;
	}

	public void setPlayerHand(List<Card> playerHand) {
		this.playerHand = playerHand;
	}
	//End G&S ****************************************

	@Override
	public String toString() {
		return "Player [playerHand=" + playerHand + "]";
	}
	

}
