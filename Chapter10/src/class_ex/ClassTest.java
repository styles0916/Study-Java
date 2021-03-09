package class_ex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

		Person person = new Person("James");
		System.out.println(person);
		
		System.out.println();
		
		Class c1 = Class.forName("class_ex.Person");
		
		Person p1 = (Person)c1.newInstance(); //default constructor 생성
		System.out.println(p1); 
		
		System.out.println();
		
 		Class[] parameterTypes = {String.class};
		Constructor cons = c1.getConstructor(parameterTypes);
		
		Person p2 = (Person)cons.newInstance("Thomas"); //매개변수가 있는 constructor 생성
		System.out.println(p2);
	}

}
