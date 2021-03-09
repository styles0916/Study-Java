package chapter5.card;

public class Card {
	
	private static int createNum = 10000;
	
	private int cardNumber;
	
	public Card() {
		createNum++;
		cardNumber = createNum;
	}
	
	public int getCardNumber() {
		return cardNumber;
	}
}
	

	
	

	
	

