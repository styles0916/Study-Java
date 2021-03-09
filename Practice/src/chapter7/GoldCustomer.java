package chapter7;

public class GoldCustomer extends Customer {
	
	protected double salesRatio;
	
	public GoldCustomer() {
		
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.1;
		
	}
	
	public GoldCustomer(int ID, String name) {
		super(ID, name);
		
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.1;
	}
	
	public int getPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}

}
