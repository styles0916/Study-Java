package interfaceex;

public class CalcTest {

	public static void main(String[] args) {

//		Calc calc = new CompleteClac(); //������ �������̽� Ÿ������ ������ ���� �ְ�,
		Calculator calc = new CompleteClac(); //��ӹ��� Ŭ������ ������ ���� �ִ�.
//		CompleteClac calc = new CompleteClac();
		int num1 = 10;
		int num2 = 2;
		
		System.out.println(calc.addition(num1, num2));
		System.out.println(calc.substraction(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
 		//calc.showInfo(); //�������̽� Ÿ������ ���� ��, Calc�� �޼��常 ����� �� �����Ƿ�, CompleteCalc�� �߰��� �޼���� ����� �� ����.
		
		calc.description(); //�����ǵ� description�� �Ҹ���.
		
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr)) ; //static �޼��� ��� ��, �ν��Ͻ� ������ ������� Ŭ���������� ȣ���Ͽ� ����� �� �ִ�.
		
	}

}
 