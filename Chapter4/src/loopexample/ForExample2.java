package loopexample;

public class ForExample2 {

	public static void main(String[] args) {
	//for구구단 코드
		
	int dan;
	int times;
	
	for(dan = 2; dan <= 9; dan++) {
	
        for(times = 1; times<=9; times++) {
        	System.out.println(dan + "X" + times + "=" + dan*times);
        }
        System.out.println();
	}
	
	// while 구구단 코드 
	int dann =2;
	int time = 1;
	
	while(dann <= 9) {
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
