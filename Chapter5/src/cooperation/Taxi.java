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
		System.out.println("�ý��� ������ �°��� �� " + passengerCount + "�� �Դϴ�.");
		System.out.println("�ý��� ������ ������ �� " + income + "�� �Դϴ�.");
	}

}
