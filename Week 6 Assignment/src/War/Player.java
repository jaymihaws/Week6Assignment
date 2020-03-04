package War;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand = new ArrayList<Card>();
	private int score = 0;
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public int getScore() {
		return score;
	}

	public void addScore() {
		score++;
	}

	public void describePlayerAndHand() {
		System.out.println("Player name: " + name);
		System.out.println("Player score: " + score);
		System.out.println("Player Hand:");
		for (int x = 0; x < hand.size(); x++) {
			hand.get(x).describeCard();
		}
	}
	
	public Card flipTopCard() {
		return hand.remove(0);
	}

	public void displayPlayerHand() {
		for (int x = 0; x < hand.size(); x++) {
			hand.get(x).describeCard();
		}
	}
	
	public void drawCardToHand(Deck fullDeck) {
		hand.add(fullDeck.drawTopCard());
	}
}
