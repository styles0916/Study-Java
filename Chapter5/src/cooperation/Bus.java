package cooperation;

public class Bus {

	int busNumber;
	int passengerCount;
	int income;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}	
	public void take(int money) { //����
		income += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(busNumber + "�� ������ �°��� " + passengerCount + "�� �Դϴ�.");
		System.out.println(busNumber + "�� ������ ������ " + income + "�Դϴ�");
	}
}

