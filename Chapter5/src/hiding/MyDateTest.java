package hiding;

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date = new MyDate();
		
		date.setDay(31);
		date.setMonth(12);
		date.setYear(2021);
		
		date.showDate();
		
		MyDate date2 = new MyDate();
		date2.setYear(2002);
		
		
	}
}
