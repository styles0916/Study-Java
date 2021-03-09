package chapter5.card;

public class CardCompany {

	private static CardCompany instance = new CardCompany(); 
	
	private CardCompany() {}
	
	public static CardCompany getInstance() {
		if(instance == null) {
			instance = new CardCompany();
		} return instance;
	}
	
	// Card create = new Card();
	
	public Card createCard() {
		Card create = new Card();				
		return create;
	}
}
	
