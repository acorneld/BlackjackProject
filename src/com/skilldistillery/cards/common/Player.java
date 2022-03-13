package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public class Player {
	// Variables
	private String name;
	private int playerHandValue = 0;
	protected List<Card> playerHand;

	// Constructors
	public Player() {

	}

	public Player(String name, List<Card> playerHand) {
		this.name = name;
		this.playerHand = playerHand;
	}
	
	public void addCard(Card card) {
		playerHand.add(card);
	}
	
	
	
	

	// Start G&S ****************************************
	public String getName() {
		return name;
	}

	public int getPlayerHandValue() {
		return playerHandValue;
	}

	public void setPlayerHandValue(int playerHandValue) {
		this.playerHandValue = playerHandValue;
	}

	public List<Card> getPlayerHand() {
		return playerHand;
	}

	
	// End G&S ****************************************

	@Override
	public String toString() {
		return "Player [playerHand=" + playerHand + "]";
	}

}
