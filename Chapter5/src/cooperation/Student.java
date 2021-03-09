package cooperation;

public class Student {

	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money; 
	}
	
	public void takeBus(Bus bus) { //객체의 협업
		bus.take(1000); //bus의 method인 take
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) { //객체의 협업
		subway.take(500); //subway의 method인 take
		this.money -=500;
	}	
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -=10000;
	}
	
	public void showInfo() {
		System.out.println(studentName + " 학생의 남은 돈은" + money + "원 입니다.");
	}
	
}
