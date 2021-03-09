package chapter5;

public class MyDate {

	private int day;
	private int month;
	private int year;

	private boolean isValid = true;

	public MyDate(int day, int month, int year) {
		setDay(day);
		setYear(year);
		setMonth(month); //���� �߿�!
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			if (0 < day && day < 32) {
				this.month = month;
			} else {
				isValid = false;
			}
			break; //break ��ġ �ʹ� �߿���.
		case 4, 6, 9, 11:
			if (0 < day && day < 31) {
				this.month = month;
			} else {
				isValid = false;
			}
			break; //break ��ġ �ʹ� �߿���.
		case 2:
			if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
				if (0 < day && day < 30) {
					this.month = month;
				} else {
					isValid = false;
				}
			} else {
				if (0 < day && day < 29) {
					this.month = month;
				} else {
					isValid = false;
				}
			}
			break; //break ��ġ �ʹ� �߿���.
		default:
			isValid = false;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String isValid() {
		if (isValid) {
			return "��ȿ�� ��¥�Դϴ�.";
		} else {
			return "��ȿ���� ���� ��¥�Դϴ�.";
		}
		//return isValid;
	}

} //�ڵ� ���� ������ �� �����ϰ� �� ��.
