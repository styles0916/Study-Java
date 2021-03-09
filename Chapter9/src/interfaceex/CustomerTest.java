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
		buyer.order(); //default 메서드를 두었어도, 구현된 인스턴스의 메서드가 불린다.

		Sell seller = customer;
		seller.sell();
		seller.order(); //default 메서드를 두었어도, 구현된 인스턴스의 메서드가 불린다.
		
		if(seller instanceof Customer) { //다운캐스팅도 가능.
			Customer cus = (Customer)seller;
		}
		((Customer)seller).buy();
	}
}
