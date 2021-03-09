package interfaceex;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("Customer Sell");
	}

	@Override
	public void buy() {
		System.out.println("Customer Buy");
	}

	@Override
	public void order() { //default �޼��� �̸� �ߺ�, ������.
		System.out.println("Customer Order");
	}
	
	public void sayHello() {
		System.out.println("Hello!");
	}

}
