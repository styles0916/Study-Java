package polymorphism;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade; //�ʱ�ȭ �� = null
	protected int bonusPoint; //�ʱ�ȭ �� = 0
	protected double bonusRatio; //�ʱ�ȭ �� = 0
	
//	public Customer() { //constructor �ַ� �ɹ����� �ʱ�ȭ
//		customerGrade = "SILVER";
//		bonusRatio = 0.01;
//	
//		System.out.println("Customer() ������ ȣ��");
//	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer(int, String) ������ ȣ��");
	}
	
	public Customer info() {
		return this;
	}
	
	public int calcPrice(int price) {
		
		bonusPoint += price* bonusRatio;

		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + "��� �Դϴ�." + " ������ ���ʽ� ����Ʈ�� " + bonusPoint + "�� �Դϴ�.";
	}
	
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
}
