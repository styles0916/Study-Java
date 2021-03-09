package chapter5;

public class MyDate {

	private int day;
	private int month;
	private int year;

	private boolean isValid = true;

	public MyDate(int day, int month, int year) {
		setDay(day);
		setYear(year);
		setMonth(month); //순서 중요!
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
			break; //break 위치 너무 중요함.
		case 4, 6, 9, 11:
			if (0 < day && day < 31) {
				this.month = month;
			} else {
				isValid = false;
			}
			break; //break 위치 너무 중요함.
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
			break; //break 위치 너무 중요함.
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
			return "유효한 날짜입니다.";
		} else {
			return "유효하지 않은 날짜입니다.";
		}
		//return isValid;
	}

} //코드 열고 닫히는 것 섬세하게 볼 것.
