package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private String name;
	private int numOfCards;
	public List <Card> playerHand;
	
	public Player(String name) {
		this.name = name;
		playerHand = new ArrayList<Card>();
	}

	
	// Start G&S ****************************************
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
