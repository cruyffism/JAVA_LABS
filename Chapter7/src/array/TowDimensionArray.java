package array;

public class TowDimensionArray {
       // 다차원 배열 	
	public static void main(String[] args) {

		int[][] arr = {{1,2,3}, {4,5,6}};
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
	
	for (int i = 0; i < arr.length; i++) {
		for(int j = 0; j< arr[i].length; j++) {
			System.out.println(arr[i][j]); // 0,0 ~ 0,2
		}
	}
	  // schar[][] alphabets = new char[13][2];
	 
  }

}
