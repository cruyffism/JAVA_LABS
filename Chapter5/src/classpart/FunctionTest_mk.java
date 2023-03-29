package classpart;

public class FunctionTest_mk {

	public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;
        
        int mul = multiplyNum(num1, num2);
        System.out.println(mul);	
	}
	
	public static int multiplyNum(int n1, int n2 ) {
		int result = n1 * n2;
		return result;
		// 함수 이름은 addNum, 매개변수 두 개 n1, n2를 더해서 result를 반환한다.
		// 반환 값이 없으면 첫 줄 int 대신에 void 쓰기
		
	}
     
}
