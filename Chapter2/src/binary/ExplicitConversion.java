package binary;

public class ExplicitConversion {

	public static void main(String[] args) {

		// 명시적 형변환의 오류 예시
		// 큰수에서 작은수로 값을 대입할 시 데이터 유실이 된다는 걸 보여줌
		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		//명시적 형변환의 예시
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum);
		
		// 결과 값이 다른 이유 
		// 먼저 정수로 바꾸고 더하니까 3+0 = 3  
		// 3.14 + 0.9 하고 난 뒤에 정수 변환이니까 결과가 4 
		float fNum = 0.9F;
		
		int num1 = (int)dNum + (int)fNum; //결과 3
		int num2 = (int)(dNum +fNum); // 결과 4 
		
		System.out.println(num1);
		System.out.println(num2);
		
		
		
		
		
	}

}
