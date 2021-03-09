package ifexample;

public class IfExample2 {

	public static void main(String[] args) {

		int age = 10;
		int charge = 0;

		if (age < 8) {
			charge = 1000;
		} else if (age < 14) {
			charge = 2000;
		} else if (age < 20) {
			charge = 3000;
		} else {
			charge = 4000;
		}

		System.out.println("나이 : " + age);
		System.out.println("요금 : " + charge);

	}

}
