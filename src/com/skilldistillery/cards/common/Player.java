package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private final String name;
	private int numOfCards;
	private List <Card> playerHand;
	
	public Player(String name) {
		this.name = name;
		playerHand = new ArrayList<Card>();
	}

	//TODO Add card method
	public void addCard(Card card) {
		playerHand.add(card);
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


}
