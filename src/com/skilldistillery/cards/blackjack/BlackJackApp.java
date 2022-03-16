package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

import com.skilldistillery.cards.common.Deck;
import com.skilldistillery.cards.common.Hand;
import com.skilldistillery.cards.common.Player;
import com.skilldistillery.cards.common.PlayerHand;

public class BlackJackApp {

	public static void main(String[] args) {

		int playerScore = 0;
		int dealerScore = 0;
		Scanner kb = new Scanner(System.in);
		BlackJackApp app = new BlackJackApp();
		Deck deck = new Deck();
		Hand playerHand = new Hand("Player");
		Hand dealerHand = new Hand("Dealer");
		Menu();
		deck.shuffle();
		// LAUNCH METHOD BELOW
		// Deal Player Two Cards
		playerHand.addCard(deck.dealCard());
		playerHand.addCard(deck.dealCard());
		// Deal Dealer Two Cards
		dealerHand.addCard(deck.dealCard());
		dealerHand.addCard(deck.dealCard());
		System.out.println(dealerHand);
		System.out.println(dealerHand.CardsValue());

		if (playerHand.CardsValue() == 21) {
			System.out.println(playerHand);
			System.out.println(playerHand.CardsValue());
			System.out.println("BLACKJACK!");
			playerScore = playerHand.CardsValue();
		} else if (playerHand.CardsValue() != 21) {
			while (playerHand.CardsValue() < 21) {
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
					playerScore = playerHand.CardsValue();
					break;
				}
			}
			if (dealerHand.CardsValue() == 21) {
				System.out.println(dealerHand);
				System.out.println(dealerHand.CardsValue());
				System.out.println("BLACKJACK!");
				dealerScore = dealerHand.CardsValue();
			} else if (dealerHand.CardsValue() <= 16) {
				while (dealerHand.CardsValue() <= 16) {
					dealerHand.addCard(deck.dealCard());
					System.out.println(dealerHand);
					System.out.println(dealerHand.CardsValue());
					dealerScore = dealerHand.CardsValue();

				}

			} else if (dealerHand.CardsValue() >= 17) {
				System.out.println("Dealer Stays at:" + dealerHand.CardsValue());
				dealerScore = dealerHand.CardsValue();
			}
		} else {
			System.out.println(playerHand);
			System.out.println(playerHand.CardsValue());
			System.out.println(dealerHand);
			System.out.println(dealerHand.CardsValue());
			System.out.println("Its a PUSH!");
			dealerScore = dealerHand.CardsValue();
			playerScore = playerHand.CardsValue();

		}
		if(didDealerWin(playerScore, dealerScore) == true) {
			System.out.println("Dealer Wins");
		}else {
			System.out.println("Player Wins");
		}
	}
	// END LAUNCH METHOD
	
	private static boolean didDealerWin(int playerScore, int dealerScore) {
		return playerScore >= dealerScore;
		
	}

	private static void Menu() {
		System.out.println("This is a game of BlackJack, you have the option to Hit or Stay.");
	}

}
