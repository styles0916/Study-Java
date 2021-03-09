package cooperation;

public class Bus {

	int busNumber;
	int passengerCount;
	int income;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}	
	public void take(int money) { //승차
		income += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명 입니다.");
		System.out.println(busNumber + "번 버스의 수입은 " + income + "입니다");
	}
}

