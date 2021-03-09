package operator;

public class OperatorEx3 {

	public static void main(String[] args) {

		int num1 = 10;
		int i1 = 2;

		boolean value1 = ((num1 += 10) < 10) && ((i1 = i1 + 2) < 10);

		System.out.println(num1);
		System.out.println(i1);
		System.out.println(value1);

		int num2 = 10;
		int i2 = 2;

		boolean value2 = ((num2 += 10) > 10) && ((i2 = i2 + 2) > 10);

		System.out.println(num2);
		System.out.println(i2);
		System.out.println(value2);
		
		int num3 = 10;
		int i3 = 2;

		boolean value3 = ((num3 += 10) < 10) || ((i3 = i3 + 2) < 10);

		System.out.println(num3);
		System.out.println(i3);
		System.out.println(value3);

		int num4 = 10;
		int i4 = 2;

		boolean value4 = ((num4 += 10) > 10) || ((i4 = i4 + 2) < 10);

		System.out.println(num4);
		System.out.println(i4);
		System.out.println(value4);
		
		int a = 10;
		int b = 20;
		
		
		int max = (a>b)?a:b;
		System.out.println(max);
	}
}
