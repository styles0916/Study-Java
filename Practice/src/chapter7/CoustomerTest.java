package chapter7;

import java.util.ArrayList;

public class CoustomerTest {

	public static void main(String[] args) {
		
		Customer vip = new VIPCustomer(100010, "V", 100);
		Customer gold1 = new GoldCustomer(100020, "G1");
		Customer gold2 = new GoldCustomer(100030, "G2");
		Customer silver1 = new Customer(100040, "S1");
		Customer silver2 = new Customer(100050, "S2");
		
		ArrayList<Customer> list = new ArrayList<Customer>();
		
		list.add(vip);
		list.add(gold1);
		list.add(gold2);
		list.add(silver1);
		list.add(silver2);
		
		System.out.println("========== 고 객 정 보 ==========");
		for(Customer customer : list) {
			customer.showCustomerInfo();
		} System.out.println();

		System.out.println("========== 구 매 정 보 ==========");
		int price = 10000;
		for(Customer customer : list) {
			System.out.println(customer.customerName + " 고객님께서 지불하실 금액은 " + customer.getPrice(price) + "원 이고, 적립된 포인트는 " + customer.bonusPoint + "점 입니다.");
		}
		
		
	}
	
}
