package array;

public class ArrayTest {

	public static void main(String[] args) {

//		int[] arr1 = new int[3];
//		int[] arr2 = new int[] {1,2,3}; 바로 값 대입 시
//		int[] arr3 = {1,2,3}; 위와 동일

		int[] arr = new int[10];
		int total = 0;

		for (int i = 0, num = 1; i < arr.length; i++, num++) { // i<=9 보다는 i<10 보다는 i<arr.length
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

		for (int i = 0; i < count; i++) { // dArr.length로 범위를 잡으면 정보가 입력되지 않은 [3], [4]가 0으로 설정되어 계산 결과가 0이 됨.
			mtotal *= dArr[i];

		}
		System.out.println(mtotal);
	}
}
