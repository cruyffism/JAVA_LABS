package array;

public class ArrayTest3 {

	public static void main(String[] args) {

	char[] alphabets = new char[26];
	char ch = 'A'; // A = 65
	
	for(int i = 0; i<alphabets.length; i++, ch++) {
		alphabets[i] = ch;
	}
	
	for(int i = 0; i<alphabets.length; i++, ch++) {
	    System.out.println(alphabets[i]);	
	}
		// 알페벳 길이(26)보다 작은 값 전부 출력! 
  }

}
