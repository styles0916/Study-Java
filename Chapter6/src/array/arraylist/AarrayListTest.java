package array.arraylist;

import java.util.ArrayList; //ctrl + shift + o

public class AarrayListTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(int i = 0; i < list.size(); i++) { //length는 배열의 길이. 길이가 10일 때, element가 3개만 들어갔어도, length는 10. size는 정확히 element가 들어간 갯수만 나타냄. 여기서는 3으로 반환.
			
			String str = list.get(i);
			System.out.println(str);
		}
		for(String str : list) {
			System.out.println(str);
		}
	}

}
