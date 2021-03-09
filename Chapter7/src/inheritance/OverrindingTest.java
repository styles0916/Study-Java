package inheritance;

public class OverrindingTest {

	public static void main(String[] args) {

		Customer lee = new Customer(100010, "이순신");
		lee.setBonusPoint(1000);
		int priceLee = lee.calcPrice(10000);
		
		
		VIP_Customer kim = new VIP_Customer(100020, "김유신"); 
		kim.setBonusPoint(10000);
		int priceKim = kim.calcPrice(10000);
		
		System.out.println(lee.showCustomerInfo() + "결제 금액은 " + priceLee + "원 입니다.");
		
		System.out.println(kim.showCustomerInfo() + "결제 금액은 " + priceKim + "원 입니다.");
		
		Customer son = new VIP_Customer(100030, "손흥민");
		son.setBonusPoint(20000);
		int priceSon = son.calcPrice(10000);
		
		System.out.println(son.showCustomerInfo() + "결제 금액은 " + priceSon + "원 입니다.");
		
	}

}
