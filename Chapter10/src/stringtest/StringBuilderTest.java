package stringtest;

public class StringBuilderTest {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");

		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer)); //������ �ּҰ�
		buffer.append(android);
		System.out.println(System.identityHashCode(buffer)); //������ �ּҰ�
		System.out.println(buffer);
		java = buffer.toString(); //�ʿ��� ��, toString���� String���� �������� ��.
		System.out.println(java);

	}

}
