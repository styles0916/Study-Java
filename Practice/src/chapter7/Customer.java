package chapter7;

public class Customer {

	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint; 
	protected double bonusRatio;  

	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public Customer(int ID, String name) {
		this.customerID = ID;
		this.customerName = name;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int getPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String CustomerInfo() {
		return customerName + " 고객님의 고객등급은 " + customerGrade + "등급이고, 현재 보유 포인트는 " + bonusPoint + "점 입니다.";
	}
	
	public void showCustomerInfo() {
		System.out.println(CustomerInfo());
	}
}
