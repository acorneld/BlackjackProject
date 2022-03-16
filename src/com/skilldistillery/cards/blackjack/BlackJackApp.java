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

		Hand dealerHand = new Hand("Dealer");
		dealerHand.addCard(deck.dealCard());
		dealerHand.addCard(deck.dealCard());
		System.out.println(dealerHand);
		System.out.println(dealerHand.CardsValue());

		if (playerHand.CardsValue() != 21 || dealerHand.CardsValue() != 21) {

			while (playerHand.CardsValue() <= 21) {
				System.out.println("Player, would you like to Hit or Stay?");
				System.out.println(playerHand);
				System.out.println("Current Score: " + playerHand.CardsValue());

				String hitOrStay = kb.nextLine();

				if (hitOrStay.equalsIgnoreCase("Hit")) {
					playerHand.addCard(deck.dealCard());
					System.out.println(playerHand);
					System.out.println("Current Score: " + playerHand.CardsValue());
				} else if (hitOrStay.equalsIgnoreCase("Stay")) {
					System.out.println("Player will stay at " + playerHand.CardsValue());
					break;
				}
			}
			// END LAUNCH METHOD
			if (dealerHand.CardsValue() == 21) {
				System.out.println(dealerHand);
				System.out.println(dealerHand.CardsValue());
				System.out.println("BLACKJACK!");
			} else if (dealerHand.CardsValue() <= 16) {
				while (dealerHand.CardsValue() <= 16) {
					dealerHand.addCard(deck.dealCard());
					System.out.println(dealerHand);
					System.out.println(dealerHand.CardsValue());
				}

			} else if (dealerHand.CardsValue() >= 17) {
				System.out.println("Dealer Stays at:" + dealerHand.CardsValue());
			}
		}
	}

	private static void Menu() {
		System.out.println("This is a game of BlackJack, you have the option to Hit or Stay.");
	}

}
