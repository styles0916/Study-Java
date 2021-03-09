package chapter7;

public class VIPCustomer extends Customer {

	protected double salesRatio;
	protected int agentID;
	
	public VIPCustomer() {
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
	}

	public VIPCustomer(int ID, String name, int aID) {
		super(ID, name);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		this.agentID = aID;
	}

	public int getPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * salesRatio);
	}

	public String CustomerInfo() {
		return super.CustomerInfo() + " 담당 상담원 번호는 " + agentID + " 입니다.";
	}
}
