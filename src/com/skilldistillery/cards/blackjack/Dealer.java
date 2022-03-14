package com.skilldistillery.cards.blackjack;

import java.util.List;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;
import com.skilldistillery.cards.common.Player;

public class Dealer extends Player{
	
	
	private Deck myCards;
	
	
	
	
	public Dealer() {
		super.setName("Barabous");
	}
		
		
	

	public void showHand() {
		System.out.println(getPlayerHand().toString());
	}
	
	public void showHandScore(List<Card> hand, int value) {
		for(Card card : hand) {
			System.out.println(card);
		}
	}
	
	public void dealToPlayer(Player player) {
	}
	
	public void dealToDealer() {
		
	}
	}
