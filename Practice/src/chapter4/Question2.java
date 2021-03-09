package chapter4;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
	
		System.out.print("홀수를 입력하세요 : ");
		
		int line = sc.nextInt();
		
		int space = (line - 1) / 2;

		for (int i = 0; i < line; i++) {

			for (int j = 0; j < line; j++) {
				if (j < space)
					System.out.print(" ");

				if (space <= j && j < line - space)
					System.out.print("*");

				if (j >= line - space)
					System.out.print(" ");

			}
			System.out.println();
		
			if (i < line / 2) {
				space--;
			}
			else {
				space++;
			}

		}
	}
}