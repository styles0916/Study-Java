package chapter5.coffeshop;

public class BeanCafe {

public int income;
	
	public String takeCoffee(int money) {
		income += money;
		if(money == Menu.beanAmericano) {
			return "��ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�.";
		} else if(money == Menu.beanlatte) {
			return "��ٹ� �󶼸� �����߽��ϴ�.";
		} else {
			return null;
		}
	
	}
	
	public void bCafeInfo() {
		System.out.println("BeanCafe�� �� ������ " + income + "�� �Դϴ�.");
	}
	
}
