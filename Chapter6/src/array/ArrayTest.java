package array;

public class ArrayTest {

	public static void main(String[] args) {

//		int[] arr1 = new int[3];
//		int[] arr2 = new int[] {1,2,3}; �ٷ� �� ���� ��
//		int[] arr3 = {1,2,3}; ���� ����

		int[] arr = new int[10];
		int total = 0;

		for (int i = 0, num = 1; i < arr.length; i++, num++) { // i<=9 ���ٴ� i<10 ���ٴ� i<arr.length
			arr[i] = num;
			total += arr[i];
			
			System.out.println(arr[i]);
			System.out.println(total);
		}

		double[] dArr = new double[5];

		int count = 0;
		dArr[0] = 1.1; count++;
		dArr[1] = 2.1; count++;
		dArr[2] = 3.1; count++;

		double mtotal = 1;

		for (int i = 0; i < count; i++) { // dArr.length�� ������ ������ ������ �Էµ��� ���� [3], [4]�� 0���� �����Ǿ� ��� ����� 0�� ��.
			mtotal *= dArr[i];

		}
		System.out.println(mtotal);
	}
}
