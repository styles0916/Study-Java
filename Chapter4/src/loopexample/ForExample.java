package loopexample;

public class ForExample {

	public static void main(String[] args) {

		int num;
		int sum = 0;

		for (num = 0; num <= 10; num++) {
			sum += num;
		}
		System.out.println(sum);

		int count = 1;
		int total = 0;

		for (int i = 0; i < 10; i++, count++) { // 10¹ø, È½¼ö ¹Ýº¹
			total += count;

		}
		System.out.println(total);

	}
}
