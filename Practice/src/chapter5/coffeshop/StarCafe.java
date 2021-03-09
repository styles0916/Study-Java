package chapter5.coffeshop;

public class StarCafe {

	public int income;
	
	public String takeCoffee(int money) {
		income += money;
		if(money == Menu.starAmericano) {
			return "별다방 아메리카노를 구입했습니다.";
		} else if(money == Menu.starlatte) {
			return "별다방 라떼를 구입했습니다.";
		} else {
			return null;
		}
	
	}
	
	public void sCafeInfo() {
		System.out.println("StarCafe의 총 수익은 " + income + "원 입니다.");
	}
	
}
