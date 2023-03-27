package loopexample;

public class ContinueEx {

	public static void main(String[] args) {
	// continue 문 (짝수만 더하기) 
	//조건이 만족하게 되면 나머지 수행문을 수행하지 말고 계속 해라~
	//(반복문과 함께 쓰임)
	
		int total = 0;
		int num;
		
		for(num = 1; num<=100; num++) {
		  if((num % 2 ) == 1) {
		     continue; 
	   }
	   total += num;	  
	}
	System.out.println(total);	
  }
	
}
