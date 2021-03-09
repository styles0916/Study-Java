package this_example;

public class Person {

	String name;
	int age;
	
	public Person() {
		this("이름 없음", 1); //초기화. 아래의 constructor를 호출. 이런식으로 할 떄는, 이 문구가 first statement여야 한다. 상단에 다른 것이 오면 안됨.
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println(name + ", " + age + "세");
	}
	
	public Person getSelf() {
		return this;
	}
}

