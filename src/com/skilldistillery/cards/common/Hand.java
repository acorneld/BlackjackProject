package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public class Hand extends PlayerHand {
	
	private int handValue;
	
	public Hand(String name) {
		super(name);
	}

	public int getHandValue() {
		return handValue;
	}

	public void setHandValue(int handValue) {
		this.handValue = handValue;
	}

	
	
}
