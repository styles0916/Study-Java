package inheritance_test;

import inheritance.Customer; //패키지가 다르면 써야함
import inheritance.VIP_Customer;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer lee = new Customer(100010, "이순신");
//		
//		lee.setCustomerName("이순신");
//		lee.setCustomerID(100010);
		lee.setBonusPoint(1000);
		System.out.println(lee.showCustomerInfo());
		
		VIP_Customer kim = new VIP_Customer(100020, "김유신");
//		Customer kim = new VIP_Customer(100020, "김유신"); //해당 kim의 타입은 Customer.

//		kim.setCustomerName("김유신");
//		kim.setCustomerID(100020);
		kim.setBonusPoint(10000);
		System.out.println(kim.showCustomerInfo());
		
		System.out.println(kim.info());
		System.out.println(kim.vInfo()); //Customer로 생성된 kim의 경우 VIP_Customer의 메서드는 사용할 수 없음.

//		lee = kim; //하위클래스는 상위클래스로 묵시적 형변환 가능.
//		kim = lee; //상위클래시는 하위클래스로 묵시적 형변환 불가.
		
		lee.calcPrice(10000);
		System.out.println(lee.getBonusPoint());
		System.out.println(lee.calcPrice(10000));
		
		kim.calcPrice(10000);
		System.out.println(kim.getBonusPoint());
		System.out.println(kim.calcPrice(10000));
	}
	
}
