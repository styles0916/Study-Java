package cooperation;

public class Subway {

	int lineNumber;
	int passengerCount;
	int income;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	public void take(int money) {
		income += money;
		passengerCount++;
	}
		public void showInfo() {
			System.out.println("����ö " + lineNumber + "ȣ���� �°��� " + passengerCount + "�� �Դϴ�.");
			System.out.println("����ö " + lineNumber + "ȣ���� ������ " + income + "�Դϴ�");
	}
	
}
