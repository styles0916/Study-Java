package stringtest;

public class StringTest2 {

	public static void main(String[] args) {

		
		String java = new String("java");
		String android = new String("android");
		System.out.println(System.identityHashCode(java));
		System.out.println(System.identityHashCode(android));
		
		java = java.concat(android); //기존 메모리에 추가되는 것이아니라, 새로운 메모리가 할당됨.
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
		
		//메모리 낭비를 줄이기 위해서 StringBuffer, StringBuilder 사용.
	}

}
