package array;

public class CharArrayTest {

	public static void main(String[] args) {

		char[] cArr = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
				'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Z' };

		for (int i = 0; i < cArr.length; i++) {
			System.out.println(cArr[i] + "," + (int)cArr[i]);
		}

		System.out.println();
		
		char[] alphabets = new char[26];
		char ch = 'a';
		
		for(int i = 0; i < alphabets.length; i++) {
			
			alphabets[i] = ch++;
			System.out.println(alphabets[i] + "," + (int)alphabets[i]);
		}
		
		
	}

}
