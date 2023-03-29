package loopexample;

public class BreakExample {

	// break문
	// 반복문에서 더 이상 반복을 수행하지 않고 빠져 나옴
	public static void main(String[] args) {

	 int sum = 0;
	 int num = 1;
	 
	 while(true) {
		  sum += num; // sum = sum+ num 이랑 같은 의미 
		  
		  if(sum>100)
			 break;
		  num++;
		 
	 }
	 
	 System.out.println(sum);
	 System.out.println(num);
	 
	}

}
