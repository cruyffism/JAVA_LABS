package classpart;

public class FunctionTest {

	public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;
        int num3 = 5;
        int num4 = 6;
        
        String lastName = "Hong";
        String firstName = "Minki";
        
        int sum = addNum(num1, num2);
        int mul = mulNum(num3, num4);
        String myName = fullName(lastName, firstName);
        		
        System.out.println(sum);		
        System.out.println(mul);		
        System.out.println(myName);	
        
	}
	
	public static int addNum(int n1, int n2 ) {
//		int result = n1 + n2;
//		return result;
		return n1 + n2 ;
		// 함수 이름은 addNum, 매개변수 두 개 n1, n2를 더해서 result를 반환한다.
		// 반환 값이 없으면 첫 줄 int 대신에 void 쓰기
		
	}
	
	public static int mulNum(int n3, int n4) {
		int answer = n3 * n4;
		return answer;
		
	}
	
	public static String fullName(String lastName, String firstName) {
		String result = lastName.concat(firstName);
		return result;
	}

}
