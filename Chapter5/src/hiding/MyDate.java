package hiding;

public class MyDate {

	private int day;
	private int month;
	private int year;

	private boolean isValid; // valid : ��ȿ�ϴ�. boolean�� �⺻ ���� false.
	
	public int getDay() { //��Ŭ�� - source - Generate getters and setters���� private �ۼ��� ������ �����ϰ� get, set ������ ���� �� �ִ�.
		return day;
	}

	public void setDay(int day) {
		this.day = day; //�Ű������� �������� �ٸ��� this�� �Ƚᵵ������ �������� ����ؾ���. this�� �ϳ����� date, date2 ���� �޸� ����Ŵ.
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 1 || month >12) {
			isValid = true;
		} else {
		
		this.month = month;
	}
	}
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void showDate() {
		
		if (isValid) { 
			System.out.println("�Է� �����Դϴ�.");
		} else {
			System.out.println(year + "�� " + month + "�� " + day + "�� �Դϴ�.");
		
		}
		
//		if (year < 0 || month < 1 || month > 12 || day < 1 || day > 31) {
//			System.out.println("�Է� ���� �Դϴ�.");
//		} else {
//			System.out.println(year + "�� " + month + "�� " + day + "�� �Դϴ�.");
//		}
	}
}
