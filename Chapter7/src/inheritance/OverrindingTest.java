package inheritance;

public class OverrindingTest {

	public static void main(String[] args) {

		Customer lee = new Customer(100010, "�̼���");
		lee.setBonusPoint(1000);
		int priceLee = lee.calcPrice(10000);
		
		
		VIP_Customer kim = new VIP_Customer(100020, "������"); 
		kim.setBonusPoint(10000);
		int priceKim = kim.calcPrice(10000);
		
		System.out.println(lee.showCustomerInfo() + "���� �ݾ��� " + priceLee + "�� �Դϴ�.");
		
		System.out.println(kim.showCustomerInfo() + "���� �ݾ��� " + priceKim + "�� �Դϴ�.");
		
		Customer son = new VIP_Customer(100030, "�����");
		son.setBonusPoint(20000);
		int priceSon = son.calcPrice(10000);
		
		System.out.println(son.showCustomerInfo() + "���� �ݾ��� " + priceSon + "�� �Դϴ�.");
		
	}

}
