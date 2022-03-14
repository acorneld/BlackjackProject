package com.skilldistillery.cards.blackjack;

import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.HandOfCards;
import com.skilldistillery.cards.common.Player;

public class BlackJackPlayer extends Player {
	
	private HandOfCards hand;
	private int handValue;
	
	public BlackJackPlayer() {
		super();
		HandOfCards hand = new HandOfCards();
	}
	
	public void addCard(Card card) {
		hand.addCard(card);
	}
	
	public void showPlayerHand() {
		List<Card> currentCards = hand.getMyCards();
			for(Card card : currentCards) {
				System.out.println(card);
			}
	}
	
	public int showHandValue() {
		handValue = hand.getHandValue();
		return handValue;
	}
	
	public void hit() {
		
	}
}

