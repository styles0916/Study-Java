package array.arraylist;

import java.util.ArrayList; //ctrl + shift + o

public class AarrayListTest2 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList(); //ArrayList<String> list = new ArrayList<String>(); <- 이렇게 어떤 타입의 객체로 배열을 만들 것인가를 쓰지 않으면,
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(int i = 0; i < list.size(); i++) { 
			
			String str = (String)list.get(i); // String을 따로 지정해줘야함.
			System.out.println(str);
		}
		for(Object str : list) { //Object로 반환되기 때문에 String 말고 Object로 씀.
			System.out.println(str);
		}
	}

}
