package array;

public class TwoDimension {

	public static void main(String[] args) {

		//int[][] arr = new int[2][3];
		int[][] arr = {{1,2,3}, {4,5,6,7}}; //{1,2,3,} : 1�� , {4,5,6} : 2�� => 2�� 3��
		
//		System.out.println(arr.length); //�� ���� ���� : 2
//		System.out.println(arr[0].length); //ù��° ���� ���� : 3
//		System.out.println(arr[1].length); //�ι�° ���� ���� : 4
		
//		int k = 1;
		
		 for(int i = 0; i < arr.length; i++) {
			 for(int j = 0; j < arr[i].length; j++/* , k++*/) {
				 //arr[i][j] = k;
				 
				 System.out.print(arr[i][j] + " ");
			 } System.out.println(); 
			}
		
	}

}
