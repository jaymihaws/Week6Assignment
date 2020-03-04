package War;

public class Card {

	private int cardValue;
	private String suit;

	public Card(int cardValue, String suit) {
		this.cardValue = cardValue;
		this.suit = suit;
	}

	public void setCardValue(int cardValue) {
		this.cardValue = cardValue;
	}

	public int getCardValue() {
		return cardValue;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getSuit() {
		return suit;
	}


	public void describeCard() {
		if (cardValue == 11) {
			System.out.println("Jack" + " of " + suit);
		} else if (cardValue == 12) {
			System.out.println("Queen" + " of " + suit);
		} else if (cardValue == 13) {
			System.out.println("King" + " of " + suit);
		} else if (cardValue == 14) {
			System.out.println("Ace" + " of " + suit);
		} else {
			System.out.println(cardValue + " of " + suit);
		}
	}
}
