package inheritance_test;

import inheritance.Customer; //��Ű���� �ٸ��� �����
import inheritance.VIP_Customer;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer lee = new Customer(100010, "�̼���");
//		
//		lee.setCustomerName("�̼���");
//		lee.setCustomerID(100010);
		lee.setBonusPoint(1000);
		System.out.println(lee.showCustomerInfo());
		
		VIP_Customer kim = new VIP_Customer(100020, "������");
//		Customer kim = new VIP_Customer(100020, "������"); //�ش� kim�� Ÿ���� Customer.

//		kim.setCustomerName("������");
//		kim.setCustomerID(100020);
		kim.setBonusPoint(10000);
		System.out.println(kim.showCustomerInfo());
		
		System.out.println(kim.info());
		System.out.println(kim.vInfo()); //Customer�� ������ kim�� ��� VIP_Customer�� �޼���� ����� �� ����.

//		lee = kim; //����Ŭ������ ����Ŭ������ ������ ����ȯ ����.
//		kim = lee; //����Ŭ���ô� ����Ŭ������ ������ ����ȯ �Ұ�.
		
		lee.calcPrice(10000);
		System.out.println(lee.getBonusPoint());
		System.out.println(lee.calcPrice(10000));
		
		kim.calcPrice(10000);
		System.out.println(kim.getBonusPoint());
		System.out.println(kim.calcPrice(10000));
	}
	
}
