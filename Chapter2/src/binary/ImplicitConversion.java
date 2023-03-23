package binary;

public class ImplicitConversion {

	public static void main(String[] args) {
		
		//묵시적 형변환 해석 : 작은수에서 큰수로 or 덜 정밀한 수에서 더 정밀한 수(정수에서 실수로)로 대입되는 경우  
		//                 자연스러운 형 변환이 가능 
	
	byte bNum = 10;
	int num = bNum;
		System.out.println(num);
		
	long lNUM = 10;
	float fNum = lNUM;
	
	System.out.println(fNum);
	
	//연산중에도 자연스러운 형변환 가능  
	// num이 float으로 형변환이 된 후 더해진 다음에 그 결과값은 double로 형 변환이 된다.
	double dNum = fNum + num;
	System.out.println(dNum);
	
	
	
	}

}
