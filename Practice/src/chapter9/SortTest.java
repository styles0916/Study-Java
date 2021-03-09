package chapter9;

import java.io.IOException;

import javax.swing.JOptionPane;

public class SortTest {

	public static void main(String[] args) throws IOException {

//		System.out.println("���Ĺ���� �����ϼ���.");
//		System.out.println("B : BubbleSort");
//		System.out.println("H : HeapSort");
//		System.out.println("Q : QuickSort");
//		
//		int ch = System.in.read();
		char ch = JOptionPane.showInputDialog("���Ĺ���� �����ϼ���. \nB : BubbleSort \nH : HeapSort \nQ : QuickSort").charAt(0);
		
		Sort sort = null;
		
		if(ch == 'B' || ch == 'b') {
			sort = new BubbleSort();
		} else if(ch == 'H' || ch == 'h') {
			sort = new HeapSort();
		} else if(ch == 'Q' || ch == 'q') {
			sort = new QuickSort();
		} else {
			System.out.println("�Է� �����Դϴ�.");
			return;
		}
		
		int[] arr = new int[10];
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
	}

}
