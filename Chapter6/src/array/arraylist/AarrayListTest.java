package array.arraylist;

import java.util.ArrayList; //ctrl + shift + o

public class AarrayListTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(int i = 0; i < list.size(); i++) { //length�� �迭�� ����. ���̰� 10�� ��, element�� 3���� ���, length�� 10. size�� ��Ȯ�� element�� �� ������ ��Ÿ��. ���⼭�� 3���� ��ȯ.
			
			String str = list.get(i);
			System.out.println(str);
		}
		for(String str : list) {
			System.out.println(str);
		}
	}

}
