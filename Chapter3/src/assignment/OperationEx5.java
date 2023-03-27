package assignment;

public class OperationEx5 {

	public static void main(String[] args) {
    // 비트 연산자
	
	// &(and)연산자 : 두 비트가 모두 1인 경우만 1아니면 0	
    int num1 = 5;
    int num2 = 10; 
    int result = num1 & num2;
    System.out.println(result);		
    int num3 = 5;
    int num4 = 11;  
    int re = num3 & num4;
    System.out.println(re);	
    
    // |(or)연산자 : 두 비트가 모두 0인 경우만 0 아니면 1 	
    int num5 = 5;
    int num6 = 10;
    int res = num5 | num6;
    System.out.println(res);
    
    //왼쪽으로 비트 쉬프트 1번하면 원래 값 곱하기 2 이다.
    int num7 = 5; //00000101;
    System.out.println(num7<<1);
    System.out.println(num7); // num7의 값은 안 바뀜
    System.out.println(num7<<=1);
    System.out.println(num7); // num7 값이 바뀜 
    
    //왼쪽으로 비트 쉬프트 2번하면 원래 값 곱하기 4이다.
    int num8 = 5;
    System.out.println(num8<<2);
    
    //오른쪽 비트 쉬프트 1번하면 맨 오른쪽 1이 잘려 나감(나누기 2와 같다)
    int num9 = 5; //00000101; >> 00000010;
    System.out.println(num9>>1);
    
	}

}
