package interfaceex;

public interface Calc {
	double PI = 3.14; //컴파일 과정에서 public static final double PI 로 상수가 됨.
	int ERROR = -999999999;
	
	int addition(int num1, int num2);
	int substraction(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	//메서드의 반환 값, 함수의 이름, 함수의 매개변수 : 함수의 시그니처
	//구체적이진 않지만 메서드의 구현이 머리에 있다는 것이기 때문에 설계가 중요함.

	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
		myMethod();
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
//		myMethod() 일반 메서드는 호출할 수 없다.
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


