package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.sayHello();
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order(); //default �޼��带 �ξ��, ������ �ν��Ͻ��� �޼��尡 �Ҹ���.

		Sell seller = customer;
		seller.sell();
		seller.order(); //default �޼��带 �ξ��, ������ �ν��Ͻ��� �޼��尡 �Ҹ���.
		
		if(seller instanceof Customer) { //�ٿ�ĳ���õ� ����.
			Customer cus = (Customer)seller;
		}
		((Customer)seller).buy();
	}
}
