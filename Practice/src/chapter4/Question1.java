package chapter4;


public class Question1 {

	public static void main(String[] args) {

		char operator = '+';
		int fNum = 10;
		int sNum = 5;
		int result = 0;

		if (operator == '+') {
			result = fNum + sNum;
		} else if (operator == '-') {
			result = fNum - sNum;

		} else if (operator == '*') {
			result = fNum * sNum;

		} else if (operator == '/') {
			result = fNum / sNum;
		} else {
			System.out.println("������ �Է� ����");
			
		} System.out.println("��� ����" + result + "�Դϴ�.");
		
		switch (operator) {
		case '+':
			result = fNum + sNum;
			break;
		case '-':
			result = fNum - sNum;
			break;
		case '*':
			result = fNum * sNum;
			break;
		case '/':
			result = fNum / sNum;
			break;
		default : System.out.println("������ �Է� ����");
		}

		System.out.println("��� ����" + result + "�Դϴ�.");

	}

}
