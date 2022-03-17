package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

import com.skilldistillery.cards.common.Deck;
import com.skilldistillery.cards.common.Hand;
import com.skilldistillery.cards.common.Player;
import com.skilldistillery.cards.common.PlayerHand;

public class BlackJackApp {

	public static void main(String[] args) {

		Menu();
		launch();
	}

	// LAUNCH METHOD BELOW
	public static void launch() {
		int playerScore = 0;
		int dealerScore = 0;
		Scanner kb = new Scanner(System.in);
		BlackJackApp app = new BlackJackApp();
		Deck deck = new Deck();
		Hand playerHand = new Hand("Player");
		Hand dealerHand = new Hand("Dealer");
		deck.shuffle();
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
					System.out.println("Player will stay at: " + playerHand.CardsValue());
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
				System.out.println("Dealer Stays at: " + dealerHand.CardsValue());
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
		while (playerScore <= 21 || dealerScore <= 21) {
			if (didDealerWin(playerScore, dealerScore) == true) {
				if (dealerScore <= 21 && playerScore <= dealerScore) {
					System.out.println("Dealer Wins!");
					break;
				} else if (dealerScore >= 22) {
					System.out.println("Dealer BUSTS!");
					if (playerScore > dealerScore && playerScore <= 21) {
						System.out.println("Player Wins!");
					} else if (playerScore < dealerScore && playerScore <= 21) {
						System.out.println("Player Wins!");
					}

					break;
				}
			} else if (didDealerWin(playerScore, dealerScore) == false) {
				if (playerScore <= 21) {
					System.out.println("Player Wins!");
					break;
				}
			}else {
				System.out.println("PUSH! Dealer Wins");
			}
		}
	}
//			} else if (dealerScore >= playerScore) {
//				System.out.println("Dealer Wins");
//			}
//		} else if (playerScore >= 22) {
//			System.out.println("Player BUSTS!");
//		}
//		else if (playerScore > dealerScore) {
//			System.out.println("Player Wins");
//		}
//
//	}
	// END LAUNCH METHOD

	private static boolean didDealerWin(int playerScore, int dealerScore) {
		return dealerScore >= playerScore;
	}

	private static void Menu() {
		System.out.println("This is a game of BlackJack, You must try to beat the Dealer by getting" +
				" as close to 21 without going over.");
		System.out.println("You have the option to Hit or Stay.");
	}
}
