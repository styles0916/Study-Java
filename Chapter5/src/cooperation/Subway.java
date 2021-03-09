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
			System.out.println("지하철 " + lineNumber + "호선의 승객은 " + passengerCount + "명 입니다.");
			System.out.println("지하철 " + lineNumber + "호선의 수입은 " + income + "입니다");
	}
	
}
