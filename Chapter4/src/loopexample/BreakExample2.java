 package loopexample;

public class BreakExample2 {

	public static void main(String[] args) {

	// break 구구단 코드 
	int dann =2;
	int time = 1;
	
	while(dann <= 9) {
        
		time = 1;	
        while(time<=9) {
        	if(time > dann) break;
        	System.out.println(dann + "X" + time + "=" + dann*time);
        	time++;
        }
        dann ++;
        System.out.println();
	}
  }

}
