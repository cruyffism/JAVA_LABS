package loopexample;

public class ContinueExample2 {

	public static void main(String[] args) {

	// continue 짝수 구구단 코드 
	int dann =2;
	int time = 1;
	
	while(dann <= 9) {
        if ( (dann % 2) !=0) {
        	dann++;
        	continue;
        }
		time = 1;	
        while(time<=9) {
        	System.out.println(dann + "X" + time + "=" + dann*time);
        	time++;
        }
        dann ++;
        System.out.println();
	}
  }

}
