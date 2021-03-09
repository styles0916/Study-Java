package inheritance;

/*public class VIP_Customer {
	
	private int customerID;
	private String customerName;
	private String customerGrade; 
	int bonusPoint; 
	double bonusRatio;
	
	private int agentID;
	double salesRatio;

	public VIP_Customer() {
		
	} 
	
}*/ //궂이 이렇게 만들 필요가 없음.

public class VIP_Customer extends Customer { //상속 extends
	
	private int agentID;
	double salesRatio;
	
//	public VIP_Customer() {
//		
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//		
//		System.out.println("VIP_Customer() 생성자 호출");
//	}
	
	public VIP_Customer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIP_Customer(int, String) 생성자 호출");
	} //상위클래스에 default 생성자가 없을 시, 명시적으로 상위 클래스를 호출해야함.
	
	public VIP_Customer vInfo() {
		return this;
	}

	@Override
	public int calcPrice(int price) {
		
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
}
	
}
