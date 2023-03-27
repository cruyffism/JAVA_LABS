package loopexample;

public class ForExample {

	public static void main(String[] args) {
	// for문 : 반복문 중 가장 많이 사용
	// 	      주로 조건이 범위,횟수인 경우 사용
	//	      초기화식,조건식,증감식을 한꺼번에 작성
	int num; 
	int sum = 0;
	
	for(num = 1; num <= 10; num++) {
		
		sum += num;
	}
	System.out.println(sum);
	System.out.println(num);
	
  }

}
