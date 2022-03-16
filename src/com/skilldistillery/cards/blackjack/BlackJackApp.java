package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

import com.skilldistillery.cards.common.Deck;
import com.skilldistillery.cards.common.Hand;
import com.skilldistillery.cards.common.Player;
import com.skilldistillery.cards.common.PlayerHand;

public class BlackJackApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		BlackJackApp app = new BlackJackApp();
		Deck deck = new Deck();
		Menu();
		deck.shuffle();
		// LAUNCH METHOD BELOW
		Hand playerHand = new Hand("Player");
		playerHand.addCard(deck.dealCard());
		playerHand.addCard(deck.dealCard());
		while(playerHand.CardsValue() <= 21) {
		System.out.println("Would you like to Hit or Stay?");
		System.out.println(playerHand);
		System.out.println(playerHand.CardsValue());
		String hitOrStay = kb.nextLine();
		if(hitOrStay.equalsIgnoreCase("Hit")){
			playerHand.addCard(deck.dealCard());
			System.out.println(playerHand);
			System.out.println(playerHand.CardsValue());
		}
		
		else if(hitOrStay.equalsIgnoreCase("Stay")) {
			System.out.println("Player will stay at" + playerHand.CardsValue());
		}
		}
		Hand dealerHand = new Hand("Dealer");
		dealerHand.addCard(deck.dealCard());
		dealerHand.addCard(deck.dealCard());
		System.out.println(dealerHand);
		System.out.println(dealerHand.CardsValue());
		// END LAUNCH METHOD
		if (dealerHand.CardsValue() == 21) {
			System.out.println("BLACKJACK!");
		}
		else if(dealerHand.CardsValue() <= 16) {
			while(dealerHand.CardsValue() <= 16) {
				dealerHand.addCard(deck.dealCard());
			}
			
		}
		else if(dealerHand.CardsValue() >= 17) {
			System.out.println("Dealer Stays");
		}
	}

	private static void Menu() {
		System.out.println("This is a game of BlackJack, you have the option to Hit or Stay.");
	}
	
	
}
