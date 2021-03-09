package cooperation;

public class Taxi {
	
	int passengerCount;
	int income;
	
	public Taxi() {}
	
	public void take(int money) {
		income += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("택시의 오늘의 승객은 총 " + passengerCount + "명 입니다.");
		System.out.println("택시의 오늘의 수입은 총 " + income + "원 입니다.");
	}

}
