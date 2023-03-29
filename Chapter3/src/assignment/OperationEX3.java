package assignment;

public class OperationEX3 {

	public static void main(String[] args) {
    
	//논리 연산자 >> 연산 결과가 true 혹은 flase로 출력
	// &&(논리 곱 = and 조건), ||(논리 합 = or 조건), !(부정) 	
	
	// A&&B 구조에서 A가 false이기에 뒤에 B는 실행되지 않는다.(and 조건)
	// 따라서 결과는 false 	A항은 20이 나오지만 B항은 실행되지 않았기에 2가 나온다.
	int num1 = 10;	
	int i = 2;	
	boolean value = ( ((num1 = num1 + 10) < 10) && ((i = i+2) > 10) );
	System.out.println(value);
	System.out.println(num1);
	System.out.println(i);
	
	// A||B 구조에서 A가 true이기에 뒤에 B는 실행되지 않는다.(or 조건)
	// 따라서 결과는 true A항은 30이 나오지만 B항은 실행되지 않았기에 4가 나온다. 
	int number1 = 20;	
	int k = 4;	
	boolean answer = ( ((number1 = number1 + 10) < 40) || ((k = k+2) > 10) );
	System.out.println(answer); 
	System.out.println(number1); 
	System.out.println(k); 
	
	}

}
