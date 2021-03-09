package class_ex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Class c1 = String.class;
		
		String str = new String();
		Class c2 = str.getClass();
		
		Class c3 = Class.forName("java.lang.String");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println();
		
		Class c4 = Class.forName("java.lang.String");
		
		Constructor[] cons = c4.getConstructors();
		for(Constructor con : cons) {
			System.out.println(con);
		} 
		
		System.out.println();
		
		Method[] methods = c4.getMethods();
		for(Method method : methods) {
			System.out.println(method);
		}
		
		// 해당 data type에 대한 정확한 정보를 모를 때 사용함.
		
	}
 }
