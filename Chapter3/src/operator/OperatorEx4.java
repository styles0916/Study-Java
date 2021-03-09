package operator;

public class OperatorEx4 {

	public static void main(String[] args) {
		
		int num1 = 0B00001011; //11 
		int num2 = 0B00000101; //5
		int num3 = 0B00001010; //10
		
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);

		System.out.println(num2 << 1);
		System.out.println(num2 << 2);
		System.out.println(num2 << 3 );

		System.out.println(num2);
		System.out.println(num2 <<= 3 );
		System.out.println(num2);
		
		System.out.println(num3);
		System.out.println(num3 >> 1);
		
	}
}
