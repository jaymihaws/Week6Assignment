package War;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> fullDeck = new ArrayList<Card>();

	public Deck() {

		int[] cardValue = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
		String[] suit = { "Diamonds", "Hearts", "Clubs", "Spades" };

		for (int j = 0; j < 13; j++) {
			for (int i = 0; i < 4; i++)
				fullDeck.add(new Card(cardValue[j], suit[i]));
		}
	}

	public void shuffle() {
		Collections.shuffle(fullDeck);
	}

	public Card drawTopCard() {
		return fullDeck.remove(0);
	}

	public void dispayDeck() {
		for (int x = 0; x < fullDeck.size(); x++) {
			fullDeck.get(x).describeCard();
		}
	}
}
