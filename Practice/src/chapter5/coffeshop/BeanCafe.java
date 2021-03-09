package chapter5.coffeshop;

public class BeanCafe {

public int income;
	
	public String takeCoffee(int money) {
		income += money;
		if(money == Menu.beanAmericano) {
			return "콩다방 아메리카노를 구입했습니다.";
		} else if(money == Menu.beanlatte) {
			return "콩다방 라떼를 구입했습니다.";
		} else {
			return null;
		}
	
	}
	
	public void bCafeInfo() {
		System.out.println("BeanCafe의 총 수익은 " + income + "원 입니다.");
	}
	
}
