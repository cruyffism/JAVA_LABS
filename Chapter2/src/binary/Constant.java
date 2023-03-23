package binary;

public class Constant {

	public static void main(String[] args) {
      final int MAX_NUM = 100; // 관용적으로 상수는 대문자로 표현
      final double PI = 3.14;  // PI는 상수, 3.14가 리터럴을 의미
      
     // PI = 3.15; >> 이렇게 정의 불가! 위에 final 상수로 정의를 해서..
     // 변할 수 없는 값을 상수로 선언!
     // 값 변경 원할 시 아래 문구에서 숫자만 바꾸면 효율적! 
      
      final int STUDENT_NUM = 30;
      
      int num = 0;
      if ( num == STUDENT_NUM ) {}
      System.out.println(STUDENT_NUM);
      
      //리터럴 : 프로그램에서 사용하는 모든 숫자, 값, 논리 값 
      // ex) 10,3.14,A,true
      //리터럴에 해당되는 값은 특정 메모리 공간인 상수 풀에 있음
      // 필요한 경우 상수 풀에서 가져와서 사용 
      
      
	}

}
