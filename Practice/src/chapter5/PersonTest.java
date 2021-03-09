package chapter5;

public class PersonTest {

	public static void main(String[] args) {
		
		Person James = new Person();
		James.age = 40; //int
		James.name = "James"; //string
		James.married = true; //boolean
		James.numberOfChild = 3; //int
		
		James.personInfo();
		James.printMyChildren();
	}
	
}
