package cooperation;

public class Student {

	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money; 
	}
	
	public void takeBus(Bus bus) { //��ü�� ����
		bus.take(1000); //bus�� method�� take
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) { //��ü�� ����
		subway.take(500); //subway�� method�� take
		this.money -=500;
	}	
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -=10000;
	}
	
	public void showInfo() {
		System.out.println(studentName + " �л��� ���� ����" + money + "�� �Դϴ�.");
	}
	
}
