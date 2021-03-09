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
	
}*/ //���� �̷��� ���� �ʿ䰡 ����.

public class VIP_Customer extends Customer { //��� extends
	
	private int agentID;
	double salesRatio;
	
//	public VIP_Customer() {
//		
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//		
//		System.out.println("VIP_Customer() ������ ȣ��");
//	}
	
	public VIP_Customer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIP_Customer(int, String) ������ ȣ��");
	} //����Ŭ������ default �����ڰ� ���� ��, ��������� ���� Ŭ������ ȣ���ؾ���.
	
	public VIP_Customer vInfo() {
		return this;
	}

	@Override
	public int calcPrice(int price) {
		
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
}
	
}
