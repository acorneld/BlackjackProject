package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public class HandOfCards extends PlayerHand {

	private int handValue;

	public HandOfCards() {
	}

	
	public boolean instantWin() {
		if (CardsValue() == 21) {
			return true;
		}
		return false;
	}

	public boolean bust() {
		if (CardsValue() > 21) {
			return true;
		}
		return false;
	}

	
	@Override
	public int CardsValue() {
		handValue = 0;
		for(Card card : myCards) {
			handValue = handValue + card.getValue();
		}
		return handValue;
	}


	public int getHandValue() {
		return handValue;
	}


	public void setHandValue(int handValue) {
		this.handValue = handValue;
	}

	

	

}

