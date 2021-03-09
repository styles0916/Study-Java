package classpart;

public class FunctionTestSelf {

	public static int addition (int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	public static int subtraction (int num1, int num2) {
		int result;
		result = num1 - num2;
		return result;
	}
	
	public static int multiplication (int num1, int num2) {
		int result;
		result = num1 * num2;
		return result;
	}

	public static int division (int num1, int num2) {
		int result;
		result = num1 / num2;
		return result;
	}
	
	public static void main (String[] args) {
		
		int n1 = 50;
		int n2 = 5;
		int aResult;
		int sResult;
		int mResult;
		int dResult;
		
		
		aResult = addition(n1, n2);
		sResult = subtraction(n1, n2);
		mResult = multiplication(n1, n2);
		dResult = division(n1, n2);
		
		System.out.println(aResult);
		System.out.println(sResult);
		System.out.println(mResult);
		System.out.println(dResult);
	}
}