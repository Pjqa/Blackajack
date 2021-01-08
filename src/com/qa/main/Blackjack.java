package com.qa.main;

public class Blackjack {
	
	public int BlackJack(int card, int card1) {
	if (card > 21 && card1 > 21) {
		return 0;
	} else if (card > 21 || card1 > 21) {
		if (card > 21) {
			return card1;
		}else {
			return card;
		}
	} else {
		if ((21 - card) < (21 - card1)) {
			return card;
		} else {
			return card1;
		}
	}
}
}
