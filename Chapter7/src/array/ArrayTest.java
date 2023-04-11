package array;

public class ArrayTest {

	public static void main(String[] args) {

		int[] numbers = new int[3]; // 칸 개수가 3개(0번째, 1번째, 2번째)
        
		numbers[0] = 1; // 0번째 값 1
		numbers[1] = 2; // 1번째 값 2
		numbers[2] = 3; // 2번째 값 3 
		
		// 1, 2, 3까지 출력
		for(int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
        
		// 0으로 초기화 
		int[] studentIDs = new int[5];
		for(int i = 0; i<studentIDs.length; i++) {
			System.out.println(studentIDs[i]);
		}
		
		
	}

}
