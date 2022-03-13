package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public abstract class PlayerHand {
	
	protected List<Card> myCards;
	
	public PlayerHand() {
		myCards = new ArrayList<Card>();
	}
	
	public PlayerHand(List<Card> myCards) {
		myCards = new ArrayList<Card>();
		this.myCards = myCards;
	}


}
