package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public class Hand extends PlayerHand {

	public Hand(String name) {
		super(name);
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

}
