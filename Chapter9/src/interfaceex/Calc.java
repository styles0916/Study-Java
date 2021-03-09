package interfaceex;

public interface Calc {
	double PI = 3.14; //������ �������� public static final double PI �� ����� ��.
	int ERROR = -999999999;
	
	int addition(int num1, int num2);
	int substraction(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	//�޼����� ��ȯ ��, �Լ��� �̸�, �Լ��� �Ű����� : �Լ��� �ñ״�ó
	//��ü������ ������ �޼����� ������ �Ӹ��� �ִٴ� ���̱� ������ ���谡 �߿���.

	default void description() {
		System.out.println("���� ���⸦ �����մϴ�.");
		myMethod();
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
//		myMethod() �Ϲ� �޼���� ȣ���� �� ����.
		myStaticMethod();
		return total;
	}
	
	private void myMethod() { 
		System.out.println("private method");
	}
	private static void myStaticMethod() {
		System.out.println("private static method");
	}


}


