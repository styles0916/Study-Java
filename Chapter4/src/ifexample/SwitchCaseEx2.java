package ifexample;

import java.util.Scanner;

public class SwitchCaseEx2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int month = scanner.nextInt();
		int day;

		switch (month) {
		case  1, 3, 5, 7, 8, 10, 12:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		case 4, 6, 9, 11:
			day = 30;
			break;
		default:
			day = 0;
			System.out.println("Error");
			return;
		}  

		System.out.println(month + "월은 총 " + day + "일 입니다.");

	}

}
