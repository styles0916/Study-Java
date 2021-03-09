package hiding;

public class MyDate {

	private int day;
	private int month;
	private int year;

	private boolean isValid; // valid : 유효하다. boolean의 기본 값은 false.
	
	public int getDay() { //우클릭 - source - Generate getters and setters에서 private 작성한 변수를 간단하게 get, set 구조로 만들 수 있다.
		return day;
	}

	public void setDay(int day) {
		this.day = day; //매개변수와 변수명이 다르면 this를 안써도되지만 가독성을 고려해야함. this는 하나지만 date, date2 각각 메모리 가리킴.
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
			System.out.println("입력 오류입니다.");
		} else {
			System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
		
		}
		
//		if (year < 0 || month < 1 || month > 12 || day < 1 || day > 31) {
//			System.out.println("입력 오류 입니다.");
//		} else {
//			System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
//		}
	}
}
