package loopexample;

public class NestedLoop {

	public static void main(String[] args) {

		int num = 2;
		int count = 1;

		/*for (num = 2; num <= 9; num++) {
			System.out.println(num + "´Ü");

			for (int i = 1; i < 10; i++) {
				count = num * i;

			//for (count = 1; count < 10; count++) {

				//System.out.println(num + "X" + i + "=" + count);

				System.out.println(num + "X" + count + "=" + num * count);
			}
			System.out.println();

		}*/
		
			 while (num < 10) {

			System.out.println(num + "´Ü");
			count = 1;

			while (count < 10) {
				System.out.println(num + "X" + count + "=" + num * count);
				count++;
			}
			num++;
			System.out.println();
		}
	}
}
