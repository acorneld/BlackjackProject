package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public abstract class PlayerHand {
	private String name;
	private int handValue;
	protected List<Card> myCards;

	public PlayerHand(String name) {
		myCards = new ArrayList<Card>();
		this.name = name;
	}

	public PlayerHand(List<Card> myCards) {
		myCards = new ArrayList<Card>();
		this.myCards = myCards;
	}

	public void muckHand() {
		myCards.clear();
	}

	public void addCard(Card card) {
		myCards.add(card);
	}

	// G & S *********************************
	public List<Card> getMyCards() {
		return myCards;
	}

	@Override
	public String toString() {
		return  name + " " + CardsValue();
	}

	public int CardsValue() {
		int handValue = 0;
		for (Card card : myCards) {
			handValue = handValue + card.getValue();
		}
		
		return handValue;
	}

}
