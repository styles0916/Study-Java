package array.arraylist;

import java.util.ArrayList; //ctrl + shift + o

public class AarrayListTest2 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList(); //ArrayList<String> list = new ArrayList<String>(); <- �̷��� � Ÿ���� ��ü�� �迭�� ���� ���ΰ��� ���� ������,
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(int i = 0; i < list.size(); i++) { 
			
			String str = (String)list.get(i); // String�� ���� �����������.
			System.out.println(str);
		}
		for(Object str : list) { //Object�� ��ȯ�Ǳ� ������ String ���� Object�� ��.
			System.out.println(str);
		}
	}

}
