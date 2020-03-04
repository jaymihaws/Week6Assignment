package War;

public class App {

	public static void main(String[] args) {
		
		//create deck
		Deck deck = new Deck();
		
		//create players
		Player player1 = new Player();
		player1.setName("Sally");
		Player player2 = new Player();
		player2.setName("Bob");

		//shuffle deck
		deck.shuffle();

		//deal deck
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.drawCardToHand(deck);
			} else {
				player2.drawCardToHand(deck);
			}
		}
		
		//flip cards and increment scores
		for (int i = 0; i < 26; i++) {
			Card player1Card = player1.flipTopCard();
			Card player2Card = player2.flipTopCard();
			if (player1Card.getCardValue() > player2Card.getCardValue()) {
				player1.addScore();
			} else {
				player2.addScore();
			}
		}

		System.out.println("Player 1 score: " + player1.getScore());
		System.out.println("Player 2 score: " + player2.getScore());

		if (player1.getScore() > player2.getScore()) {
			System.out.println("PLAYER 1 WINS!!!");
		} else if (player1.getScore() == player2.getScore()) {
			System.out.println("It's a draw, play again!");
		} else {
			System.out.println("PLAYER 2 WINS!!!");
		}
	}
}
