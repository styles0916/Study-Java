package chapter9;

import java.io.IOException;

import javax.swing.JOptionPane;

public class SortTest {

	public static void main(String[] args) throws IOException {

//		System.out.println("정렬방식을 선택하세요.");
//		System.out.println("B : BubbleSort");
//		System.out.println("H : HeapSort");
//		System.out.println("Q : QuickSort");
//		
//		int ch = System.in.read();
		char ch = JOptionPane.showInputDialog("정렬방식을 선택하세요. \nB : BubbleSort \nH : HeapSort \nQ : QuickSort").charAt(0);
		
		Sort sort = null;
		
		if(ch == 'B' || ch == 'b') {
			sort = new BubbleSort();
		} else if(ch == 'H' || ch == 'h') {
			sort = new HeapSort();
		} else if(ch == 'Q' || ch == 'q') {
			sort = new QuickSort();
		} else {
			System.out.println("입력 오류입니다.");
			return;
		}
		
		int[] arr = new int[10];
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
	}

}
