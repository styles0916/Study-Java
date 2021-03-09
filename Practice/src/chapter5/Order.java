package chapter5;

public class Order {

	String orderNumber;
	String orderID;
	String orderDate;
	String orderName;
	String productNumber;
	String deliveryAddress;

	public void orderInfo() {
		
		System.out.println("주문 번호 : " + orderNumber);
		System.out.println("주문자 아이디 : " + orderID);
		System.out.println("주문 날짜 : " + orderDate);
		System.out.println("주문자 이름 : " + orderName);
		System.out.println("주문 상품 번호 : " + productNumber);
		System.out.println("배송 주소 : " + deliveryAddress);
		
	}
	
}
