package chapter10;

class MyDate {

	int day;
	int month;
	int year;
	
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public int hashCode() {
		return year * month * day;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate date = (MyDate)obj;
			if(this.year == date.year && this.month == date.month && this.day == date.day) {
				return true;
			}else return false;
		}return false;
	}
}

public class MyDateTest{
	public static void main(String[] args) {
		
		MyDate md1 = new MyDate(2021, 3, 9);
		MyDate md2 = new MyDate(2021, 3, 9);
		System.out.println(md1.equals(md2));
		System.out.println(md1.hashCode());
		System.out.println(md2.hashCode());
	}
}
