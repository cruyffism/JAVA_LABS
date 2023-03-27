package assignment;

public class OperationEx2 {

	public static void main(String[] args) {

		//증가 감소 연산자 >> 연산자의 위치가 중요함
	    // ++ : 항의 값에 1을 더한다.
	    // -- : 항의 값에 1을 뺍니다.
	    int num = 10;
	    System.out.println(num++); // 이 문장에선 10으로 출력하고 문장이 끝나고 나면 
	    System.out.println(num);   // 증가시켜서 11로 출력을해라 
	    
		int number = 1;
		System.out.println(++number); // 이 문장이 끝나기 전에 증가시켜서 2로 출력
		
		//관계 연산자 >> 연산 결과가 true 혹은 flase로 출력
		System.out.println(3<5);
		System.out.println(3>5);
		
		int num1 = 10;
		int num2 = 5;
		boolean flag = (num1>num2);
	    System.out.println(flag);
	    
	    
		
		
	}

}
