package chapter5;

public class MyDateTest {
	
	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(31, 12, 2021);
		MyDate date2 = new MyDate(29, 2, 2401);
		
		System.out.println(date1.isValid());
		System.out.println(date2.isValid());
		
//		date1.isValid(); //���� �Ͱ� ��¹�� ���� �˱�. void -> String, return.
//		date2.isValid(); //���� �Ͱ� ��¹�� ���� �˱�. void -> String, return.
		
		
	}
}
