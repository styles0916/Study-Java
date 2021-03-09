package stringtest;

public class StringBuilderTest {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");

		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer)); //동일한 주소값
		buffer.append(android);
		System.out.println(System.identityHashCode(buffer)); //동일한 주소값
		System.out.println(buffer);
		java = buffer.toString(); //필요할 때, toString으로 String값을 가져오면 됨.
		System.out.println(java);

	}

}
