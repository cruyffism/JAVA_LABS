package ifexample;

public class SwitchCase2 {

	public static void main(String[] args) {

	//Switch-case문(if-else문 대신하여 사용 가능)		
	int rank = 3;
	char medalColor;
	
	switch(rank) {
	     case 1: medalColor = 'G';
			     break;
	     case 2: medalColor = 'S';
			     break;
	     case 3: medalColor = 'B';
			     break;
		 default: medalColor = 'A';			 
	}
	System.out.println(rank +"등 메달의 색깔은 "+medalColor+"입니다.");	
		
	}

}
