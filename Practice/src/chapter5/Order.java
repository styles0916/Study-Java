package chapter5;

public class Order {

	String orderNumber;
	String orderID;
	String orderDate;
	String orderName;
	String productNumber;
	String deliveryAddress;

	public void orderInfo() {
		
		System.out.println("�ֹ� ��ȣ : " + orderNumber);
		System.out.println("�ֹ��� ���̵� : " + orderID);
		System.out.println("�ֹ� ��¥ : " + orderDate);
		System.out.println("�ֹ��� �̸� : " + orderName);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + productNumber);
		System.out.println("��� �ּ� : " + deliveryAddress);
		
	}
	
}
