package interfaceex;

public class CalcTest {

	public static void main(String[] args) {

//		Calc calc = new CompleteClac(); //구현한 인터페이스 타입으로 선언할 수도 있고,
		Calculator calc = new CompleteClac(); //상속받은 클래스로 선언할 수도 있다.
//		CompleteClac calc = new CompleteClac();
		int num1 = 10;
		int num2 = 2;
		
		System.out.println(calc.addition(num1, num2));
		System.out.println(calc.substraction(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
 		//calc.showInfo(); //인터페이스 타입으로 선언 시, Calc의 메서드만 사용할 수 있으므로, CompleteCalc에 추가한 메서드는 사용할 수 없다.
		
		calc.description(); //재정의된 description이 불린다.
		
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr)) ; //static 메서드 사용 시, 인스턴스 생성과 상관없이 클래스명으로 호출하여 사용할 수 있다.
		
	}

}
 