package classpart;

public class FunctionTest {

	public static int addNum(int num1, int num2) { // �Ű����� O
		int result;
		result = num1 + num2;
		return result; // ��ȯ�� O
	}

	public static void sayHello(String greeting) { // �Ű����� O
		System.out.println(greeting); // ��ȯ�� ����
	}

	public static int calcSum() { // �Ű����� ����

		int sum = 0;
		int i;

		for (i = 0; i <= 100; i++) {
			sum += i;
		}

		return sum; // ��ȯ�� O
	}

	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 20;
		int total = addNum(n1, n2);

		sayHello("�ȳ��ϼ���.");

		int num = calcSum();

		System.out.println(total);
		System.out.println(num);

	}
}
