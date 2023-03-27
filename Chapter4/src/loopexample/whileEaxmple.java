package loopexample;

public class whileEaxmple {

	public static void main(String[] args) {
    //while문 조건식이 참인 동안 수행문을 반복해서 수행
	//        주로 조건식이 true, false로 나타남	
	// while(true){} >> 무한 반복 	
	int num = 1;
	int sum = 0;
	
	while( num <= 10) {
	
         sum += num;
         num++;
	}
	System.out.println("1부터 10까지의 합은" + sum + "입니다");

	//do while문 : 먼저 수행문을 한 번 수행하고 조건식 체크
	//            수행문이 반드시 한 번 이상 수행 되어야 하는 경우 사용  >> 결과 값이 1이 나와야 하는데 질문 필요
		int num1 = 1;
		int sum1 = 0;
		
		do {
	         sum1 += num1;
	         num1++;
		}while(num1 < 1);
		System.out.println("1부터 10까지의 합은" + sum + "입니다");
	
	
	}

}
