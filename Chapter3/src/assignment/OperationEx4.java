package assignment;

public class OperationEx4 {

	public static void main(String[] args) {
    
	// 복합 대입 연산자 	
	int num1 = 10;
	System.out.println(num1 += 1);	
	System.out.println(num1 %= 10); //num1이 11로 변한 상태로 나누기
	num1 -= 1; //num1 = num1 - 1;
	System.out.println(num1);
	
	//조건 연산자
	int num = (5 > 3)? 10:20; // 참이면 10 거짓이면 20 출력
	System.out.println(num);  // 문장, 숫자 등 여러가지 대입 가능
	
	
	
	}

}
