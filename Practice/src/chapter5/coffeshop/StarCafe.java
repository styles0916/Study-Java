package chapter5.coffeshop;

public class StarCafe {

	public int income;
	
	public String takeCoffee(int money) {
		income += money;
		if(money == Menu.starAmericano) {
			return "���ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�.";
		} else if(money == Menu.starlatte) {
			return "���ٹ� �󶼸� �����߽��ϴ�.";
		} else {
			return null;
		}
	
	}
	
	public void sCafeInfo() {
		System.out.println("StarCafe�� �� ������ " + income + "�� �Դϴ�.");
	}
	
}
