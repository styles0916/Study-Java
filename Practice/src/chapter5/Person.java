package chapter5;

public class Person {
	int age;
	String name;
	boolean married;
	int numberOfChild;
	
	public void personInfo() {
		System.out.println("나이 : " + age);
		System.out.println("이름 : " + name);
		System.out.println("결혼여부 : " + married);
		System.out.println("자녀 수 : " + numberOfChild);
	}
	
	public void printMyChildren() {
		if(married) {
			if(numberOfChild > 0) {
				System.out.println("나는 기혼이고, 자녀는 " + numberOfChild + "명 입니다.");
			} else {
				System.out.println("나는 기혼입니다.");
			}
		} else {
			System.out.println("나는 미혼입니다.");
		}
	}
}
