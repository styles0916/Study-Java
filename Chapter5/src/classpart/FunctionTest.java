package classpart;

public class FunctionTest {

	public static int addNum(int num1, int num2) { // 매개변수 O
		int result;
		result = num1 + num2;
		return result; // 반환값 O
	}

	public static void sayHello(String greeting) { // 매개변수 O
		System.out.println(greeting); // 반환값 없음
	}

	public static int calcSum() { // 매개변수 없음

		int sum = 0;
		int i;

		for (i = 0; i <= 100; i++) {
			sum += i;
		}

		return sum; // 반환값 O
	}

	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 20;
		int total = addNum(n1, n2);

		sayHello("안녕하세요.");

		int num = calcSum();

		System.out.println(total);
		System.out.println(num);

	}
}
