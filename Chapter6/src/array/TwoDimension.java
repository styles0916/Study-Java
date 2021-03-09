package array;

public class TwoDimension {

	public static void main(String[] args) {

		//int[][] arr = new int[2][3];
		int[][] arr = {{1,2,3}, {4,5,6,7}}; //{1,2,3,} : 1행 , {4,5,6} : 2행 => 2행 3열
		
//		System.out.println(arr.length); //총 행의 갯수 : 2
//		System.out.println(arr[0].length); //첫번째 행의 길이 : 3
//		System.out.println(arr[1].length); //두번째 행의 길이 : 4
		
//		int k = 1;
		
		 for(int i = 0; i < arr.length; i++) {
			 for(int j = 0; j < arr[i].length; j++/* , k++*/) {
				 //arr[i][j] = k;
				 
				 System.out.print(arr[i][j] + " ");
			 } System.out.println(); 
			}
		
	}

}
