package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public abstract class PlayerHand {
	private int currentValue;
	protected List<Card> myCards;

	public PlayerHand() {
		myCards = new ArrayList<Card>();
	}

	public PlayerHand(List<Card> myCards) {
		myCards = new ArrayList<Card>();
		this.myCards = myCards;
	}

	public void addCard(Card card) {
		myCards.add(card);
	}

	public boolean instantWin() {
		if (getPlayerHandValue() == 21) {
			return true;
		}
		return false;
	}

	public boolean bust() {
		if (getPlayerHandValue() > 21) {
			return true;
		}
		return false;
	}

	
	// G & S *********************************
	public List<Card> getMyCards() {
		return myCards;
	}

	public int getPlayerHandValue() {
		currentValue = 0;
		for(Card card : myCards) {
			currentValue = currentValue + card.getValue();
		}
		return currentValue;
	}
	
	@Override
	public String toString() {
		return "PlayerHand [myCards=" + myCards + "]";
	}

}
