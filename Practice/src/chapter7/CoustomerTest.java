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
		
		System.out.println("========== �� �� �� �� ==========");
		for(Customer customer : list) {
			customer.showCustomerInfo();
		} System.out.println();

		System.out.println("========== �� �� �� �� ==========");
		int price = 10000;
		for(Customer customer : list) {
			System.out.println(customer.customerName + " ���Բ��� �����Ͻ� �ݾ��� " + customer.getPrice(price) + "�� �̰�, ������ ����Ʈ�� " + customer.bonusPoint + "�� �Դϴ�.");
		}
		
		
	}
	
}
